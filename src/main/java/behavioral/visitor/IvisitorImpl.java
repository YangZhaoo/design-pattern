package main.java.behavioral.visitor;

public class IvisitorImpl implements Ivisitor {
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程：" + freeCourse.getName());
    }

    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("实战课程：" + codingCourse.getName() + ", price：" + codingCourse.getPrice() + "元");
    }
}
