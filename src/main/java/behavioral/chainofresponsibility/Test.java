package main.java.behavioral.chainofresponsibility;

import main.java.behavioral.menento.Article;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/9
 * Time:10:25
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("设计模式--Java版本",
                "this is a article",
                "this is a valid video, it's 10 min");
        Approver articleApprover = new ArticleApprover("文稿审核");
        Approver nameApprover = new NameApprover("标题审核");
        Approver videoApprover = new VideoApprover("视频审核");
        videoApprover.setNextApprover(nameApprover);
        nameApprover.setNextApprover(articleApprover);
        videoApprover.deploy(course);
    }
}
