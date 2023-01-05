package ast.variables;

public class MultiplyExpression {
	NumberClass left;
	NumberClass right;
	String operation;
	
	public MultiplyExpression(NumberClass left){
		this.left=left;
	}
	
	public MultiplyExpression(NumberClass left,NumberClass right,String operation){
		this.left=left;
		this.right=right;
		this.operation=operation;
	}
	
	@Override
	public String toString() {
		if(operation!="") {
			return  left.toString();
		}else {
			return  left.toString() + operation + right.toString();
		}
		
	}
}
