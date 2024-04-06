package main.java.struction.flyweight;

import java.util.Arrays;
import java.util.List;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/6
 * Time:13:17
 *
 * JDK中的享元模式
 * {@link java.lang.Integer#valueOf(int)}
 */
public class Test {
    public void flyweightTest() {
        List<String> list = Arrays.asList("HR", "RD", "QA", "PM");
        for (int i = 0; i < 20; i++) {
            String department = list.get((int)(Math.random() * 4));
            Employee employee = EmployFactory.getEmployee(department);
            employee.report();
        }
    }

    public static void integerTest() {
        Integer a = Integer.valueOf(100);
        Integer b = 100;

        Integer c = Integer.valueOf(1000);
        Integer d = 1000;

        System.out.println("a==b：" + (a == b));
        System.out.println("c==d：" + (c == d));
    }

    public static void main(String[] args) {
        integerTest();
    }
}
