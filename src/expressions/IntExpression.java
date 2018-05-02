package expressions;

public class IntExpression extends Expression {

	int value;
	
	@Override
	public Object getValue() {
		return value;
	}
	
	public IntExpression(int value) {
		this.value = value;
	}

}
