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

    public void displayTitle(PrintStream printStream) {
        printStream.println(title);
    }
}
