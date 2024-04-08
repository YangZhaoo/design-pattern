package main.java.behavioral.visitor.example2;

public class Bachelor implements Resume {
    @Override
    public void participatInterviews(Company company) {
        System.out.println("Bachelor will join intervel of " + company.getName() + ", url: [" +  company.getInterviewurl() + "]");
    }
}
