package main.java.behavioral.iterator;

import java.util.Iterator;
import java.util.List;

public class CourseIteratorImplV2 implements Iterator {

    private List list;
    private int position;

    public CourseIteratorImplV2(List list) {
        this.list = list;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Object next() {
        return list.get(position ++);
    }
}
