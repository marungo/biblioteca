package biblioteca;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaTest {
    private static PrintStream printStream;
    private static BufferedReader bufferedReader;
    private Book book;

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

    @Test
    public void shouldContainListOfBooks(){
        MainMenu mainMenu = new MainMenu();
        Boolean result = mainMenu.getOptions().contains("List Books");
        assertThat(result, is(true));
    }

}