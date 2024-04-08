package main.java.behavioral.visitor;


/**
 * JDK中的访问者模式
 * {@link java.nio.file.FileVisitor}
 */
public class Test {
    public static void main(String[] args) {
        Course javaCourse = new FreeCourse("Java基础语法课程");
        Course designPatternCourse = new CodingCourse("设计模式", 299);

        javaCourse.accept(new IvisitorImpl());
        designPatternCourse.accept(new IvisitorImpl());
    }
}
