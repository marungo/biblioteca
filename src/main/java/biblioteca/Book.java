package biblioteca;

import java.io.PrintStream;

public class Book {
    String title;

    public Book(String title) {
        this.title = title;
    }

    public void displayTitle(PrintStream printStream) {
        printStream.println(title);
    }
}
