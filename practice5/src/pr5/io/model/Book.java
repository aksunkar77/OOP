package pr5.io.model;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Book implements Serializable {
    private String title;
    private String author;
    private transient int visitCount; 

    public Book(String title, String author, int visitCount) {
        this.title = title;
        this.author = author;
        this.visitCount = visitCount;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', visits=" + visitCount + "}";
    }
}
