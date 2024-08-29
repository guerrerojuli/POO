package tp04.ej06;

public class NotExpression extends Expression {
    private Expression e;

    public NotExpression(Expression e) {
       this.e = e;
    }

    @Override
    public boolean evaluate() {
        return !e.evaluate();
    }
}
