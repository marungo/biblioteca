package biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class Biblioteca {
    private static PrintStream printStream = System.out;
    public static ArrayList<Book> books = new ArrayList<>();

    public static void addBook(String title, String author, String yearPublished) {
        Book b = new Book(title, author, yearPublished);
        books.add(b);
    }

    public static void displayAllBooks(PrintStream printStream) {
        StringBuilder booksDisplay = new StringBuilder();
        for (Book b: books){
            booksDisplay.append(b.toString());
        }
        printStream.println(booksDisplay.toString());
    }

    public static void displayWelcomeMessage(PrintStream printStream) {
        printStream.println("Welcome to biblioteca! We are open for service.");
    }

    public static void setUp() {
        addBook("The Odyssey", "Homer", "100AD");
        addBook("The Chamber of Secrets", "JK Rowling", "1997");
    }

    public static void run() {
        setUp();
        displayWelcomeMessage(printStream);
        displayAllBooks(printStream);
    }



}
