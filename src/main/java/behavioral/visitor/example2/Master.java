package main.java.behavioral.visitor.example2;

public class Master implements Resume {

    @Override
    public void participatInterviews(Company company) {
        System.out.println("Master will join intervel of " + company.getName() + ", url: [" +  company.getInterviewurl() + "]");
    }
}
