package main.java.creation.builder.v1;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/3
 * Time:18:18
 */
public abstract class CourseBuilder {
    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);
    public abstract Course makeCourse();
}
