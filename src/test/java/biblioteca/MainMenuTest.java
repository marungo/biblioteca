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
    public void shouldContainListOfBooks(){
        MainMenu mainMenu = new MainMenu(biblioteca);
        Boolean result = mainMenu.getOptions().contains("List Books");
        assertThat(result, is(true));
    }

    @Test
    public void shouldDisplayListOfOptions(){
        MainMenu mainMenu = new MainMenu(biblioteca);
        mainMenu.display(printStream);
        String message = "Main Menu\n\tList Books\n";
        verify(printStream).println(message);

    }

    @Test
    public void shouldRunBibliotecaWhenListBooksIsSelected(){
        MainMenu menu = new MainMenu(biblioteca);

        String option = "List Books";
        menu.select(option);

        verify(biblioteca).run();
    }

}