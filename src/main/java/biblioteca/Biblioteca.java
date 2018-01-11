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

        //        String listOfBooks = "The Odyssey by Homer in 100AD\nThe Chamber of Secrets by JK Rowling in 1997\n";
        for (Book b : books){
            booksDisplay.append(b.title + " by " + b.author + " in " + b.yearPublished + "\n");

        }

        printStream.println(booksDisplay.toString());

    }
    public static void main(String[] args) {
        Welcome.displayWelcomeMessage(Biblioteca.printStream);

        Biblioteca.displayAllBooks(printStream);
    }


}
