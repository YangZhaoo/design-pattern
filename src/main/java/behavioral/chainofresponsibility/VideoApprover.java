package main.java.behavioral.chainofresponsibility;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/9
 * Time:10:18
 */
public class VideoApprover extends Approver {

    public VideoApprover(String stepName) {
        super(stepName);
    }

    @Override
    protected boolean approver(Course course) {
        String video = course.getVideo();
        return video.length() > 20;
    }
}
