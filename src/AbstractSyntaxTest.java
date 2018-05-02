import syntax.AddExpression;
import syntax.Expression;
import syntax.FunctionCallExpression;
import syntax.IntExpression;
import syntax.PrintFunction;
import syntax.StringExpression;

public class AbstractSyntaxTest {
	
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
					new AddExpression(new IntExpression(2), new IntExpression(2)),
				};
			Expression exp = new FunctionCallExpression(new PrintFunction(), arguments);
			exp.getValue();
		}
	}
	
}
