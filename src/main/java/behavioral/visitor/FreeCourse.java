package main.java.behavioral.visitor;

public class FreeCourse extends Course {
    public FreeCourse(String name) {
        super(name);
    }

    @Override
    public void accept(Ivisitor ivisitor) {
        ivisitor.visit(this);
    }
}
