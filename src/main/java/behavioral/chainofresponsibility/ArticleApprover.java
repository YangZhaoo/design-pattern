package main.java.behavioral.chainofresponsibility;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/9
 * Time:10:18
 */
public class ArticleApprover extends Approver {
    public ArticleApprover(String stepName) {
        super(stepName);
    }

    @Override
    protected boolean approver(Course course) {
        String article = course.getArticle();
        return article.length() > 10 && article.length() < 20;
    }
}
