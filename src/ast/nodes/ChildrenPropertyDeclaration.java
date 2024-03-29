package ast.nodes;

import ast.NodeType;
import gen.dart_parse;

import java.util.ArrayList;
import java.util.List;

public class ChildrenPropertyDeclaration extends Node{
	List<WidgetsDeclaration> widgetsDeclarationList;
	
	public ChildrenPropertyDeclaration(dart_parse.ChildrenPropertyDeclarationContext ctx) {
		super(ctx);
		this.widgetsDeclarationList = new ArrayList<>();
	}
	
	public void addWidgets(WidgetsDeclaration widget) {
		widgetsDeclarationList.add(widget);
	}
	
	public List<WidgetsDeclaration> getWidgetDeclarationList() {
		return widgetsDeclarationList;
	}

	public void setWidgetDeclarationList(List<WidgetsDeclaration> list) {
		this.widgetsDeclarationList = list;
	}

	@Override
	public String toString() {
		return getLineString()+"Children Property Declaration  " + " parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+ NodeType.PROPERTY+"\n"
				+widgetsDeclarationList
				;
	}

	public String generate_code() {
		StringBuilder builder = new StringBuilder();
		for(WidgetsDeclaration child : widgetsDeclarationList){
			builder.append(child.generate_code());
		}
		return builder.toString();

	}
}
