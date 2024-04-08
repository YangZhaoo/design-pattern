package main.java.behavioral.observer;

import java.util.Observable;

public class JavaApplication extends Observable {
    private String name;

    public JavaApplication(String name) {
        this.name = name;
    }

    public void throwException(String exceptionMsg) {
        this.setChanged();
        System.out.println(name + exceptionMsg + "，将启动应急计划，通知所有观察者...");
        this.notifyObservers(exceptionMsg);
    }
}
