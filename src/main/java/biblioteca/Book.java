package biblioteca;

import java.io.PrintStream;

public class Book {
    String title;
    String author;
    String yearPublished;

    public Book(String title, String author, String yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }

    public String toString() {
        return title + " | " + author + " | " + yearPublished + "\n";
    }
}
