package main.java.singleton;

import main.java.singleton.bean.HungrySingleton;
import main.java.singleton.bean.LazySingleton;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/4
 * Time:9:37
 *
 * jdk中的单例{@link java.lang.Runtime}
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable1 = () -> {
            LazySingleton instance = LazySingleton.getInstanceDCL();
            System.out.println(Thread.currentThread().getName() + " " + instance);
        };
        new Thread(runnable1).start();
        new Thread(runnable1).start();
        System.out.println("complete");

        Thread.sleep(1000);
        Runnable runnable2 = () -> {
            HungrySingleton instance = HungrySingleton.getInstance();
            System.out.println(Thread.currentThread().getName() + " " + instance);
        };
        new Thread(runnable2).start();
        new Thread(runnable2).start();
        System.out.println("complete");
    }
}
