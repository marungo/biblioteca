package biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaTest {
    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private Book book;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        Biblioteca.addBook("The Odyssey", "Homer", "100AD");
        Biblioteca.addBook("The Chamber of Secrets", "JK Rowling", "1997");
    }

    @Test
    public void shouldDisplayAllBooksInList(){
        Biblioteca.displayAllBooks(printStream);
        String listOfBooks = "The Odyssey by Homer in 100AD\nThe Chamber of Secrets by JK Rowling in 1997\n";
        verify(printStream).println(listOfBooks);
    }

}