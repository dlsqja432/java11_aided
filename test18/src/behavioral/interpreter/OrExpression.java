package behavioral.interpreter;
// Or 연산 표현식
public class OrExpression implements Expression {

	private Expression expr1;
	private Expression expr2;
	
	public OrExpression(Expression expr1, Expression expr2) {
		this.expr1 = expr1;
		this.expr2 = expr2;
	}

	@Override
	public boolean interpreter(String context) {
		boolean res = expr1.interpreter(context) || expr2.interpreter(context);
		return res;
	}
}
