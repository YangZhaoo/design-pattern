package main.java.behavioral.interpreter;

public class MultInterpreter implements Interpreter {
    private Interpreter firstExpression;
    private Interpreter secondExpression;

    public MultInterpreter(Interpreter firstExpression, Interpreter secondExpression) {
        this.firstExpression = firstExpression;
        this.secondExpression = secondExpression;
    }
    @Override
    public int interpret() {
        return firstExpression.interpret() * secondExpression.interpret();
    }

    @Override
    public String toString() {
        return "*";
    }
}
