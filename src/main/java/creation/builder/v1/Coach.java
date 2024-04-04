package main.java.creation.builder.v1;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/3
 * Time:18:24
 */
public class Coach {
    private CourseBuilder courseBuilder;
    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String courseName,
                             String coursePPT,
                             String courseVideo,
                             String courseArticle,
                             String courseQA) {
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildCoursePPT(coursePPT);
        courseBuilder.buildCourseVideo(courseVideo);
        courseBuilder.buildCourseArticle(courseArticle);
        courseBuilder.buildCourseQA(courseQA);
        return courseBuilder.makeCourse();
    }
}
