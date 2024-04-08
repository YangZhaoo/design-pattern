package main.java.behavioral.command;


/**
 * JDK中的命令模式
 * {@link java.lang.Runnable}
 */
public class Test {
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("Java 课程");
        Staff staff = new Staff();
        staff.addCommand(new OpenCourseVideoCommand(courseVideo));
        staff.addCommand(new CloseCourseVideoCommand(courseVideo));
        staff.execute();
    }
}
