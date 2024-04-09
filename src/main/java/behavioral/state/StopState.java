package main.java.behavioral.state;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/9
 * Time:11:11
 */
public class StopState extends CourseVideoState {
    @Override
    public void play() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("停止状态不能快进");
    }

    @Override
    public void pause() {
        System.out.println("停止状态不能暂停");
    }

    @Override
    public void stop() {
        System.out.println("停止播放视频");
    }
}
