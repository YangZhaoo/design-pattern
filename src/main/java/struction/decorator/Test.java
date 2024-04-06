package main.java.struction.decorator;

import java.io.Reader;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/6
 * Time:9:56
 *
 * jdk 中的装饰者模式
 * {@link java.io.BufferedReader#BufferedReader(Reader)}
 * {@link java.io.FilterInputStream}
 */
public class Test {

    public static void order1() {
        AOrders appleOrder = new AppleMac();
        appleOrder = new AppleCarePlus(appleOrder);
        appleOrder = new MacProtectiveCase(appleOrder);
        System.out.println(appleOrder.getDesc());
        System.out.println("总计：" + appleOrder.getCost() + "元");
    }

    public static void order2() {
        AOrders appleOrder = new AppleMac();
        appleOrder = new AppleCarePlus(appleOrder);
        appleOrder  = new AppleCarePlus(appleOrder);
        System.out.println(appleOrder.getDesc());
        System.out.println("总计：" + appleOrder.getCost() + "元");
    }

    public static void order3() {
        AOrders appleOrder = new AppleMac();
        System.out.println(appleOrder.getDesc());
        System.out.println("总计：" + appleOrder.getCost() + "元");
    }
    public static void main(String[] args) {
        order1();
        order2();
        order3();
    }
}
