package main.java.behavioral.iterator;


/**
 * JDK中的迭代器模式
 * {@link java.util.Iterator}
 */
public class Test {
    public static void main(String[] args) {
        CourseAggregate courseAggregate = new CourseAggregateImpl();
        courseAggregate.addCourse(new Course("Java"));
        courseAggregate.addCourse(new Course("ML"));
        courseAggregate.addCourse(new Course("DL"));
        courseAggregate.addCourse(new Course("Python"));
        Course dp = new Course("Design-pattern");
        courseAggregate.addCourse(dp);
        CourseIterator courseIterator = courseAggregate.getCourseIterator();
        while (courseIterator.hasNext()) {
            System.out.println(courseIterator.next());
        }

        System.out.println("----------------------");

        courseAggregate.removeCourse(dp);
        courseIterator = courseAggregate.getCourseIterator();
        while (courseIterator.hasNext()) {
            System.out.println(courseIterator.next());
        }
    }
}
