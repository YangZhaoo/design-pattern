package main.java.behavioral.menento;

public class Test {
    public static void main(String[] args) {
        Article article = new Article("这是内容v1", "这是标题v1", "这是图片v1");
        System.out.println("第一版：" + article);
        ArticleMenentoManager.addMenento(article.saveToMenento());
        article.setContent("这是内容v2：ERROR");
        System.out.println("第二版：" + article);
        article.undoFromMenmento(ArticleMenentoManager.getMenento());
        System.out.println("第二版有误，撤回上一版：" + article);
        article.setContent("这是内容v2：right");
        ArticleMenentoManager.addMenento(article.saveToMenento());
        System.out.println(article);
    }
}
