package expressions;

public class ArithmeticExpressions extends Expression {
	
	public Expression left; 
	private char operator;
	public Expression right;
	
	
	public ArithmeticExpressions(IntExpression left, IntExpression right, char operator) {
		this.left = left;
		this.right = left;
		this.operator = operator;
	}
	
	public ArithmeticExpressions(int left, int right, char operator) {
		this.left = new IntExpression(left);
		this.right = new IntExpression(right);
		this.operator = operator;
	}
	
	public ArithmeticExpressions(double left, double right, char operator) {
		this.left = new DoubleExpression(left);
		this.right = new DoubleExpression(right);
		this.operator = operator;
	}
	@Override
	public Object getValue() {
		if (left.getValue() instanceof Double) {
			switch(operator) {
			case '+':
				return (double) left.getValue() + (double) right.getValue();
			case '-':
				return (double) left.getValue() - (double) right.getValue();
			case '*':
				return (double) left.getValue() * (double) right.getValue();
			case '/':
				return (double) left.getValue() / (double) right.getValue();
			default:
				return null;
			}
		}
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
