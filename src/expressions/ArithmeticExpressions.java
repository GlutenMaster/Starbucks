package expressions;

public class ArithmeticExpressions extends Expression {
	
	public IntExpression left; 
	private char operator;
	public IntExpression right;
	
	public ArithmeticExpressions(IntExpression left, IntExpression right, char operator) {
		this.left = left;
		this.right = left;
		this.operator = operator;
	}
	
	@Override
	public Object getValue() {
		switch(operator) {
		case '+':
			return (int) left.getValue() + (int) right.getValue();
		case '-':
			return (int) left.getValue() - (int) right.getValue();
		case '*':
			return (int) left.getValue() * (int) right.getValue();
		case '/':
			return (int) left.getValue() / (int) right.getValue();
		default:
			return null;
		}
		
	}
	
}
