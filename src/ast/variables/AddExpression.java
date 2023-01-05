package ast.variables;

public class AddExpression {
	MultiplyExpression left;
	MultiplyExpression right;
	String operation;
	
	public AddExpression(MultiplyExpression left){
		this.left=left;
	}
	
	public AddExpression(MultiplyExpression left,MultiplyExpression right,String operation){
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
