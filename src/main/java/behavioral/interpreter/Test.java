package main.java.behavioral.interpreter;

/**
 * JDK中的解释器模式
 * 正则表达式 {@link java.util.regex.Pattern}
 */
public class Test {
    public static void main(String[] args) {
        ExpressionParse expressionParse = new ExpressionParse();
        int res = expressionParse.parse("6 100 11 + *");
        System.out.println(res);
    }
}
