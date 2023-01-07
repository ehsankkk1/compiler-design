package ast.nodes;

import ast.variables.NumberClass;

public class HeightPropertyDeclaration extends ContainerPropertiesDeclarationAbstractChild{
	NumberClass number ;
	
	public HeightPropertyDeclaration(NumberClass number,int line ,String parent) {
		super(line,parent);
		this.number = number;
	}
	
	@Override
	public String toString() {

		return "Height Property height = "+number.toString()+"+ Declaration line: "+getLine() +" parent "+getParent()
				+" Child Count =  "+getChildCount()+" Type = "+getType()+"\n"
				;
	}
}
