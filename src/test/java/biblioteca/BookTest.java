package biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BookTest {
    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private Book book;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        book = new Book("The Odyssey");
    }

    @Test
    public void bookDisplaysTitle(){
        String message = "The Odyssey";
        book.displayTitle(printStream);
        verify(printStream).println(message);
    }

    @Test
    public void bookDisplaysDetails(){
        String message = "The Oddyssey, Homer, "
    }



}