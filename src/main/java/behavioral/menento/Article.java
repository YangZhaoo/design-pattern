package main.java.behavioral.menento;

public class Article {
    private String content;
    private String title;
    private String imgs;

    public Article(String content, String title, String imgs) {
        this.content = content;
        this.title = title;
        this.imgs = imgs;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs;
    }

    public ArticleMenento saveToMenento() {
        return new ArticleMenento(this.content, this.title, this.imgs);
    }

    public void undoFromMenmento(ArticleMenento articleMenento) {
        this.content = articleMenento.getContent();
        this.title = articleMenento.getTitle();
        this.imgs = articleMenento.getImgs();
    }

    @Override
    public String toString() {
        return "Article{" +
                "content='" + content + '\'' +
                ", title='" + title + '\'' +
                ", imgs='" + imgs + '\'' +
                '}';
    }
}
