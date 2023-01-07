package ast.nodes;

import ast.variables.NumberClass;

public class EdgeInsistAll extends Node{
	NumberClass number;
	
	public EdgeInsistAll(NumberClass number,int line ,String parent) {
		super(line,parent);
		this.number = number;
	}
	
	@Override
	public String toString() {

		return "Edge Insist line:"+getLine() + " parent "+getParent()
				+number.toString()
				;
	}
}
