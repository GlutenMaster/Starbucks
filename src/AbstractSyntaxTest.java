import expressions.ArithmeticExpressions;
import expressions.Expression;
import expressions.IntExpression;
import expressions.StringExpression;
import syntax.FunctionCallExpression;
import syntax.PrintFunction;

public class AbstractSyntaxTest {
	/*
	public static void main (String[] args) {
		{
			Expression[] arguments = { new StringExpression("Hello World\n") };
			Expression exp = new FunctionCallExpression(new PrintFunction(), arguments);
			exp.getValue();
		}
		{
			Expression[] arguments =
				{
					new StringExpression("2 + 2 = "),
					new ArithmeticExpressions(new IntExpression(2), new IntExpression(2), '-'),
				};
			Expression exp = new FunctionCallExpression(new PrintFunction(), arguments);
			exp.getValue();
		}
	}
	*/
}
