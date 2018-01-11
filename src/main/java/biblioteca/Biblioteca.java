package biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class Biblioteca {
    private static PrintStream printStream = System.out;
    private static ArrayList<Book> books = new ArrayList<>();

    public static void addBook(String title, String author, String yearPublished) {
        Book b = new Book(title, author, yearPublished);
        books.add(b);
    }

    public static void displayAllBooks(PrintStream printStream) {
        StringBuilder booksDisplay = new StringBuilder();
        for (Book b : books){
            booksDisplay.append(b.title + " by " + b.author + " in " + b.yearPublished + "\n");
        }
        printStream.println(booksDisplay.toString());
    }

    public static void displayWelcomeMessage(PrintStream printStream) {
        printStream.println("Welcome to biblioteca! We are open for service.");
    }

    public static void main(String[] args) {
        displayWelcomeMessage(printStream);
        displayAllBooks(printStream);
    }


}
