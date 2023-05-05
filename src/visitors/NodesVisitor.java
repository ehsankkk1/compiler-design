package visitors;

import ast.NodeType;
import ast.Scope;
import ast.SymbolTableObject;
import ast.nodes.*;
import ast.variables.AbstractNumberClass;
import gen.dart_parse;
import org.antlr.v4.runtime.TokenStream;
import visitors.DartVisitors.StatementsVisitors;
import visitors.FlutterVisitor.WidgetsVisitor;

import java.util.ArrayList;
import java.util.List;


public class NodesVisitor extends dart_parseBaseVisitorChild {
    StatementsVisitors statementsVisitors = new StatementsVisitors();
    public TokenStream tokenStream;

    public NodesVisitor(TokenStream tokenStream) {
        this.tokenStream = tokenStream;
    }
    public NodesVisitor() {}

    //**************************** base declarations start code ********************************///
    @Override
    public TopTreeDeclaration visitTopTreeDeclaration(dart_parse.TopTreeDeclarationContext ctx) {

        Scope s = new Scope();
        s.setId(index);
        s.setScopeName("Global Scope (0)");
        s.setParent(null);
        scopes.push(s);
        scopeNames.add(s.getScopeName());

        TopTreeDeclaration topTreeDeclaration = new TopTreeDeclaration(ctx);

        for (int i = 0; i < ctx.allClassesDeclaration().size(); i++) {
            if (ctx.allClassesDeclaration().get(i) != null) {
                topTreeDeclaration.getTopTreeClassesChildrenList().add(visitAllClassesDeclaration(ctx.allClassesDeclaration(i)));
            }
        }

        for (int i = 0; i < ctx.dartDeclaration().size(); i++) {
            if (ctx.dartDeclaration().get(i) != null) {
                topTreeDeclaration.getTopTreeDartVariablesChildrenList().add(visitDartDeclaration(ctx.dartDeclaration(i)));
            }

        }

        return topTreeDeclaration;
    }
    @Override
    public AllClassesDeclarationAbstractChild visitAllClassesDeclaration(dart_parse.AllClassesDeclarationContext ctx) {

        if (ctx.classDeclaration() != null) {
            return visitClassDeclaration(ctx.classDeclaration());
        }
        if (ctx.statelessClassDeclaration() != null) {
            return visitStatelessClassDeclaration(ctx.statelessClassDeclaration());
        }
        if (ctx.statefullClassDeclaration() != null) {
            return visitStatefullClassDeclaration(ctx.statefullClassDeclaration());
        }
        return null;
    }
    @Override
    public ClassDeclaration visitClassDeclaration(dart_parse.ClassDeclarationContext ctx) {
        Scope s = new Scope();
        s.setScopeName("Class Scope (" + index + ")");
        s.setParent(scopes.get(index - 1));
        scopes.push(s);
        index = index + 1;
        s.setId(index);
        scopeNames.add(s.getScopeName() + " Parent Is " + s.getParent().getScopeName());

        ClassDeclaration classDec = new ClassDeclaration(ctx.NAME().toString(), ctx);
        for (int i = 0; i < ctx.dartDeclaration().size(); i++) {
            classDec.getDartDeclarationList().add(this.visitDartDeclaration(ctx.dartDeclaration(i)));
        }

        scopes.pop();
        index = index - 1;
        return classDec;
    }
    @Override
    public StatelessClassDeclaration visitStatelessClassDeclaration(dart_parse.StatelessClassDeclarationContext ctx) {
        StatelessClassDeclaration statelessClassDeclaration = new StatelessClassDeclaration(ctx.NAME().getText(), visitBuildMethodDeclaration(ctx.buildMethodDeclaration()),ctx);

        for (int i = 0; i < ctx.dartDeclaration().size(); i++) {
            statelessClassDeclaration.getDartDeclarationList().add(this.visitDartDeclaration(ctx.dartDeclaration(i)));
        }

        return statelessClassDeclaration;
    }

    @Override
    public BuildMethodDeclaration visitBuildMethodDeclaration(dart_parse.BuildMethodDeclarationContext ctx) {

        WidgetsVisitor widgetsVisitor = new WidgetsVisitor();

        BuildMethodDeclaration buildMethodDeclaration
                = new BuildMethodDeclaration(widgetsVisitor.visitWidgetsDeclaration(ctx.widgetsDeclaration()),
                visitBuildContextDeclaration(ctx.buildContextDeclaration()),
                ctx
        );

        for (int i = 0; i < ctx.dartDeclaration().size(); i++) {
            buildMethodDeclaration.getDartDeclarations().add(this.visitDartDeclaration(ctx.dartDeclaration(i)));
        }

        return buildMethodDeclaration;
    }

    @Override
    public BuildContextDeclaration visitBuildContextDeclaration(dart_parse.BuildContextDeclarationContext ctx) {
        return new BuildContextDeclaration(ctx.NAME().getText(), ctx);
    }



    @Override
    public StatefullClassDeclaration visitStatefullClassDeclaration(dart_parse.StatefullClassDeclarationContext ctx) {

        Scope scope = new Scope();
        scope.setScopeName("StatefullClass Scope (" + index + ")");
        scope.setParent(scopes.get(index - 1));
        scopes.push(scope);
        index = index + 1;
        scope.setId(index);
        scopeNames.add(scope.getScopeName() + " Parnet Is " + scope.getParent().getScopeName());


        StatefullFirstBody firstBody = visitStfulFirstBody(ctx.stfulFirstBody());
        StatefullSecondBody secondBody = visitStfulSecondBody(ctx.stfulSecondBody());

        return new StatefullClassDeclaration(firstBody, secondBody,ctx);
    }

    @Override
    public StatefullFirstBody visitStfulFirstBody(dart_parse.StfulFirstBodyContext ctx) {
        String type = NodeType.CLASS.toString();

        StatefullFirstBody statefullFirstBody
                = new StatefullFirstBody(
                        ctx,
                ctx.NAME().getText(),
                visitStatefullAssignStateClassDeclaration(ctx.statefullAssignStateClassDeclaration())
                );

        for (int i = 0; i < ctx.dartDeclaration().size(); i++) {
            statefullFirstBody.getDartDeclarationList().add(visitDartDeclaration(ctx.dartDeclaration(i)));
        }

        return statefullFirstBody;
    }

    @Override
    public StatefullSecondBody visitStfulSecondBody(dart_parse.StfulSecondBodyContext ctx) {

        String type = NodeType.CLASS.toString();

        StatefullSecondBody statefullSecondBody
                = new StatefullSecondBody(
                ctx,
                ctx.NAME(0).getText(),
                ctx.NAME(1).getText(),
                visitBuildMethodDeclaration(ctx.buildMethodDeclaration())
        );

        for (int i = 0; i < ctx.dartDeclaration().size(); i++) {
            statefullSecondBody.getDartDeclarationList().add(visitDartDeclaration(ctx.dartDeclaration(i)));
        }

        return statefullSecondBody;
    }

    @Override
    public StatefullAssignStateClassDeclaration visitStatefullAssignStateClassDeclaration(dart_parse.StatefullAssignStateClassDeclarationContext ctx) {
        String type = NodeType.CLASS.toString();

        return new StatefullAssignStateClassDeclaration(
                ctx,
                ctx.NAME().getText(),
                visitReturnStateTypes(ctx.returnStateTypes()));
    }

    @Override
    public ReturnStateTypes visitReturnStateTypes(dart_parse.ReturnStateTypesContext ctx) {
        String name = "";
        String type = NodeType.BLOCK.toString();

        if (ctx.functionReturnState() != null) {
            name = ctx.functionReturnState().NAME().getText();
        }
        if (ctx.returnArrowState() != null) {
            name = ctx.returnArrowState().NAME().getText();
        }
        return new ReturnStateTypes(name, ctx);
    }

    @Override
    public Object visitFunctionReturnState(dart_parse.FunctionReturnStateContext ctx) {
        return super.visitFunctionReturnState(ctx);
    }

    @Override
    public Object visitReturnArrowState(dart_parse.ReturnArrowStateContext ctx) {
        return super.visitReturnArrowState(ctx);
    }


    //******************************* dart visitors ****************************************//

    public DartDeclaration visitDartDeclaration(dart_parse.DartDeclarationContext ctx) {

        int line = ctx.start.getLine();
        String parent = ctx.getParent().getClass().getName().replace("gen.dart_parse$", "").replace("Context", "");
        VariablesVisitor variablesVisitor = new VariablesVisitor();

        NavigationVisitor navigationVisitor = new NavigationVisitor();

        String type = NodeType.OBJECT.toString();
        int childCount = ctx.getChildCount();
        if (ctx.variable() != null) {
            return new DartDeclaration(variablesVisitor.visitVariable(ctx.variable()), line, parent, type, childCount);
        }

        else if(ctx.navigation() != null){
            return new DartDeclaration(navigationVisitor.visitNavigation(ctx.navigation()), line, parent, type, childCount);
        }

        //else if (ctx.function() != null) {
        //      return new DartDeclaration(visitFunction(ctx.function()), line, parent, type, childCount);
        // }
        else if (ctx.dartAllListsDeclaration() != null) {
            ListsVisitor listsVisitor = new ListsVisitor();
            return new DartDeclaration(listsVisitor.visitDartAllListsDeclaration(ctx.dartAllListsDeclaration()), line, parent, type, childCount);
        } else return null;
    }

    @Override
    public BooleanOperation visitBooleanOperation(dart_parse.BooleanOperationContext ctx) {
        if (!ctx.numberDouble().isEmpty() || !ctx.number().isEmpty()) {
            AbstractNumberClass num1;
            AbstractNumberClass num2;
            VariablesVisitor variablesVisitor = new VariablesVisitor();
            if (ctx.numberDouble().size() == 2) {
                num1 = variablesVisitor.visitNumberDouble(ctx.numberDouble(0));
                num2 = variablesVisitor.visitNumberDouble(ctx.numberDouble(1));
            } else if (ctx.number().size() == 2) {
                num1 = variablesVisitor.visitNumber(ctx.number(0));
                num2 = variablesVisitor.visitNumber(ctx.number(1));
            } else {
                num1 = variablesVisitor.visitNumber(ctx.number(0));
                num2 = variablesVisitor.visitNumberDouble(ctx.numberDouble(0));
            }
            String operator = ctx.getChild(1).toString();
            return new BooleanOperation(num1, num2, null, null, operator);
        } else if (ctx.NAME(0) != null && ctx.NAME(1) != null) {

            String key1 = ctx.NAME(0).getText();
            String key2 = ctx.NAME(1).getText();

            if (scopes.get(index - 1).getSymbolMap().containsKey(key1) && scopes.get(index - 1).getSymbolMap().containsKey(key2)) {

                SymbolTableObject s1 = scopes.get(index - 1).getSymbolMap().get(key1);
                SymbolTableObject s2 = scopes.get(index - 1).getSymbolMap().get(key2);
                String operator = ctx.getChild(1).toString();
                return new BooleanOperation(null, null, s1, s2, operator);
            }
        }
        return null;
    }


}
