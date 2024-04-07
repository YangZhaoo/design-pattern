package main.java.behavioral.interpreter;

public class NumberInterpreter implements Interpreter {
    private Integer number;

    public NumberInterpreter(Integer number) {
        this.number = number;
    }

    public NumberInterpreter(String number) {
        this.number = Integer.valueOf(number);
    }

    @Override
    public int interpret() {
        return number;
    }
}
