package main.java.behavioral.visitor.example2;

public abstract class Company {

    private String name;
    private String interviewurl;

    public Company(String name, String interviewurl) {
        this.name = name;
        this.interviewurl = interviewurl;
    }

    public String getName() {
        return name;
    }

    public String getInterviewurl() {
        return interviewurl;
    }

    public abstract void accept(Resume resume);
}
