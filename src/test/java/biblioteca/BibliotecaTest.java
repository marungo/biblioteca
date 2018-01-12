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
    private Biblioteca biblioteca;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        biblioteca = new Biblioteca();
        biblioteca.addBook("The Odyssey", "Homer", "100AD");
        biblioteca.addBook("The Chamber of Secrets", "JK Rowling", "1997");

    }

    @Test
    public void shouldDisplayWelcomeMessage() {
        Biblioteca.displayWelcomeMessage(printStream);
        String message = "Welcome to biblioteca! We are open for service.";
        verify(printStream).println(message);
    }

    @Test
    public void shouldDisplayAllBooksInList(){
        biblioteca.displayAllBooks(printStream);
        String listOfBooks = "The Odyssey | Homer | 100AD\nThe Chamber of Secrets | JK Rowling | 1997\n";
        verify(printStream).println(listOfBooks);
    }



}