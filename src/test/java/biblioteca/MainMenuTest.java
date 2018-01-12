package biblioteca;

import org.junit.BeforeClass;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MainMenuTest {
    private static PrintStream printStream;
    private static BufferedReader bufferedReader;

    @BeforeClass
    public static void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        Biblioteca.setUp();
    }

    @Test
    public void shouldContainListOfBooks(){
        MainMenu mainMenu = new MainMenu();
        Boolean result = mainMenu.getOptions().contains("List Books");
        assertThat(result, is(true));
    }

    @Test
    public void shouldDisplayListOfOptions(){
        MainMenu mainMenu = new MainMenu();
        mainMenu.display(printStream);
        String message = "Main Menu\n\tList Books\n";
        verify(printStream).println(message);

    }
}