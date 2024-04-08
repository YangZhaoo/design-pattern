package main.java.behavioral.visitor;

public class CodingCourse extends Course {

    private int price;
    public CodingCourse(String name, int price) {
        super(name);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public void accept(Ivisitor ivisitor) {
        ivisitor.visit(this);
    }
}
