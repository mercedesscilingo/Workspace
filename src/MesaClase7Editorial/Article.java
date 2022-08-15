package MesaClase7Editorial;

import java.util.Date;

public class Article {

    private String title;
    private String topic;
    private String author;
    private Date date;

    public Article(String title, String topic, String author, Date date) {
        this.title = title;
        this.topic = topic;
        this.author = author;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
