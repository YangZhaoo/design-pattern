package main.java.behavioral.chainofresponsibility;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/9
 * Time:10:18
 */
public class NameApprover extends Approver {

    public NameApprover(String stepName) {
        super(stepName);
    }

    @Override
    protected boolean approver(Course course) {
        String name = course.getName();
        return name.length() > 10 && name.length() < 20;
    }
}
