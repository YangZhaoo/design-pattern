package main.java.behavioral.observer;

import java.util.Observer;

/**
 * 观察者模式的应用：事件监听。
 */
public class Test {
    public static void main(String[] args) {
        Observer person = new PersonObserver();
        Observer sre = new REObserver();
        Observer logger = new MonitorObserver();

        JavaApplication application = new JavaApplication("伊万控制中心");
        application.addObserver(logger);
        application.addObserver(sre);
        application.addObserver(person);
        application.throwException("控制失效");

    }
}
