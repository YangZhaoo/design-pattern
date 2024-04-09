package main.java.behavioral.chainofresponsibility;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/9
 * Time:10:15
 */
public abstract class Approver {
    private Approver approver;
    private String stepName;

    public Approver(String stepName) {
        this.stepName = stepName;
    }

    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    public final void deploy(Course course) {
        if (approver(course)) {
            System.out.println(stepName + "审核通过");
            doNext(course);
        } else {
            System.out.println(stepName + "审核失败，结束");
        }
    }

    protected abstract boolean approver(Course course);

    private void doNext(Course course) {
        if (null != approver) {
            approver.deploy(course);
        } else {
            System.out.println("审核全部通过");
        }
    }
}
