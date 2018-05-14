package expressions;

public class DoubleExpression extends Expression {

	Double value;
	
	@Override
	public Object getValue() {
		return value;
	}
	
	public DoubleExpression(Double value) {
		this.value = value;
	}

}
