package main.java.creation.builder.v1;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/3
 * Time:18:30
 */
public class Test {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("设计模式",
                "设计模式PPT",
                "设计模式视频",
                "大话设计模式",
                "设计模式问答");
        System.out.println(course);
    }
}
