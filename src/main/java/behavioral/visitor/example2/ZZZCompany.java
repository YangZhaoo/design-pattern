package main.java.behavioral.visitor.example2;

public class ZZZCompany extends Company{
    public ZZZCompany(String name, String interviewurl) {
        super(name, interviewurl);
    }

    @Override
    public void accept(Resume resume) {
        resume.participatInterviews(this);
    }
}
