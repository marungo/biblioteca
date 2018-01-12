package biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class Biblioteca {
    private static PrintStream printStream = System.out;
    public ArrayList<Book> books = new ArrayList<>();

    public void addBook(String title, String author, String yearPublished) {
        Book b = new Book(title, author, yearPublished);
        books.add(b);
    }

    public  void displayAllBooks(PrintStream printStream) {
        StringBuilder booksDisplay = new StringBuilder();
        for (Book b: books){
            booksDisplay.append(b.toString());
        }
        printStream.println(booksDisplay.toString());
    }

    public static void displayWelcomeMessage(PrintStream printStream) {
        printStream.println("Welcome to biblioteca! We are open for service.");
    }

    public void run() {
        displayWelcomeMessage(printStream);
        setUp();
        displayAllBooks(printStream);
    }

    private void setUp() {
        addBook("The Odyssey", "Homer", "100AD");
        addBook("The Chamber of Secrets", "JK Rowling", "1997");
    }


}
