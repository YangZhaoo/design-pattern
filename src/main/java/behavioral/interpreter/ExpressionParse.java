package main.java.behavioral.interpreter;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ExpressionParse {

    private static final List<String> OPERATORS = Arrays.asList("+", "-", "*", "/");

    private Stack<Interpreter> stack = new Stack<>();

    public int parse(String str) {
        String[] item = str.split(" ");
        for (String s : item) {
            if (!OPERATORS.contains(s)) {
                stack.push(new NumberInterpreter(s));
            } else {
                Interpreter first = stack.pop();
                Interpreter second = stack.pop();
                int interpret = 0;
                if ("+".equals(s)) {
                    interpret = new AddInterpreter(first, second).interpret();
                } else if ("*".equals(s)) {
                    interpret = new MultInterpreter(first, second).interpret();
                }
                stack.push((new NumberInterpreter(interpret)));
            }
        }
        return stack.pop().interpret();
    }
}
