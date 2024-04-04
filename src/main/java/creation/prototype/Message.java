package main.java.creation.prototype;

import java.util.Date;

/**
 * Create with IntelliJ IDEA
 * Author:YangZhao
 * Date:2024/4/4
 * Time:14:57
 */
public class Message implements Cloneable {
    private String from;
    private String to;
    private String title;
    private String content;
    private Date data;

    public Message(String from, String to, String title, String content, Date data) {
        this.from = from;
        this.to = to;
        this.title = title;
        this.content = content;
        this.data = data;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Message{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", data=" + data +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Message msg = (Message) super.clone();
        msg.data = (Date) msg.data.clone();
        return msg;
    }
}
