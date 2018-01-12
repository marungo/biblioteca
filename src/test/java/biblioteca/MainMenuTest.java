package biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MainMenuTest {
    private static PrintStream printStream;
    private static BufferedReader bufferedReader;
    private Biblioteca biblioteca;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        biblioteca = mock(Biblioteca.class);

    }

    @Test
    public void shouldDisplayMenuWhenMenuStarts(){
        MainMenu mainMenu = new MainMenu(biblioteca, printStream);
        mainMenu.start();
       String message = "Main Menu\n\tList Books\n";
       verify(printStream).println(message);
    }

//    @Test
//    public void whenListBooksOptionSelectedDisplayBooks() throws IOException {
//        when(bufferedReader.readLine()).thenReturn("List Books");
//        when(biblioteca.displayAllBooks(printStream)).thenReturn("The Odyssey | Homer | 100AD\nThe Chamber of Secrets | JK Rowling | 1997\n");
//        MainMenu mainmenu = mock(MainMenu.class);
//        mainmenu.recieveOption(bufferedReader);
//
//        verify(biblioteca,times(1)).displayAllBooks(printStream);
//    }
}