package main.java.builder.v2;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/3
 * Time:18:30
 */
public class Test {
    public static void main(String[] args) {
        Course.CourseBuilder courseBuilder = new Course.CourseBuilder();
        Course course = courseBuilder.setCourseName("设计模式")
                .setCoursePPT("设计模式PPT")
                .setCourseVideo("设计模式视频")
//                .setCourseArticle("大话设计模式")
                .setCourseQA("设计模式问答")
                .build();
        System.out.println(course);
    }
}
