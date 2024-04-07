package main.java.behavioral.templatemethod;

public class Test {
    public static void main(String[] args) {
        ACourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("----------------------");
        ACourse feCourse = new FECourse(true);
        feCourse.makeCourse();
    }
}
