package main.java.behavioral.visitor.example2;

public class ABCCompany extends Company {
    public ABCCompany(String name, String interviewurl) {
        super(name, interviewurl);
    }

    @Override
    public void accept(Resume resume) {
        if (resume instanceof Master) {
            resume.participatInterviews(this);
        } else {
            System.out.println("不匹配");
        }
    }
}
