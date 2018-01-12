package biblioteca;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaTest {
    private static PrintStream printStream;
    private static BufferedReader bufferedReader;

    @BeforeClass
    public static void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        Biblioteca.setUp();
    }

    @Test
    public void shouldDisplayWelcomeMessage() {
        Biblioteca.displayWelcomeMessage(printStream);
        String message = "Welcome to biblioteca! We are open for service.";
        verify(printStream).println(message);
    }

    @Test
    public void shouldDisplayAllBooksInList(){
        Biblioteca.displayAllBooks(printStream);
        String listOfBooks = "The Odyssey by Homer in 100AD\nThe Chamber of Secrets by JK Rowling in 1997\n";
        verify(printStream).println(listOfBooks);
    }



}