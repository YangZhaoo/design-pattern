package main.java.behavioral.templatemethod;

public class DesignPatternCourse extends ACourse {

    @Override
    protected boolean needWriteActicle() {
        return true;
    }

    @Override
    void packageCourse() {
        System.out.println("提供课程Java源码");
    }
}
