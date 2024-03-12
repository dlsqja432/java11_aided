package behavioral.interpreter;
// And 연산
public class AndExpression implements Expression {

	private Expression expr1 = null;
	private Expression expr2 = null;
	
	public AndExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}
	
	@Override
	public boolean interpreter(String context) {
		boolean res = expr1.interpreter(context) && expr2.interpreter(context);
		return res;
	}
}
