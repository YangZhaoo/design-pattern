package main.java.behavioral.command;

public class CourseVideo {

    private String name;

    public CourseVideo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void open() {
        System.out.println(name + "课程，video开放");
    }

    public void close() {
        System.out.println(name + "课程，video关闭");
    }
}
