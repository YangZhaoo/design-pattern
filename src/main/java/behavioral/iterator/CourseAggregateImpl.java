package main.java.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class CourseAggregateImpl implements CourseAggregate {

    private List<Course> list = new ArrayList<>();

    @Override
    public void addCourse(Course course) {
        list.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        list.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(list);
    }
}
