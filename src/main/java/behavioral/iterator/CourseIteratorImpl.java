package main.java.behavioral.iterator;

import java.util.List;

public class CourseIteratorImpl implements CourseIterator {
    private List courses;
    private int position;

    public CourseIteratorImpl(List courses) {
        this.courses = courses;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < courses.size();
    }

    @Override
    public Course next() {
        return (Course) courses.get(position++);
    }
}
