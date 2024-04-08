package main.java.behavioral.menento;

public class ArticleMenento {

    private final String content;
    private final String title;
    private final String imgs;

    public ArticleMenento(String content, String title, String imgs) {
        this.content = content;
        this.title = title;
        this.imgs = imgs;
    }

    public String getContent() {
        return content;
    }

    public String getTitle() {
        return title;
    }

    public String getImgs() {
        return imgs;
    }

    @Override
    public String toString() {
        return "ArticleMenento{" +
                "content='" + content + '\'' +
                ", title='" + title + '\'' +
                ", imgs='" + imgs + '\'' +
                '}';
    }
}
