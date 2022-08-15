package MesaClase7Editorial;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Edition {

    private int number;
    private Date date;
    private int price;
    private List article;

    public Edition(int number, Date date, int price) {
        this.number = number;
        this.date = date;
        this.price = price;
        this.article = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public List getArticle() {
        return article;
    }

    public void setArticle(List article) {
        this.article = article;
    }
}
