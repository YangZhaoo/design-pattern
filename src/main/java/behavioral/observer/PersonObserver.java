package main.java.behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class PersonObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        String msg = (String) arg;
        System.out.println(msg + ", 引信立刻失效");
    }
}
