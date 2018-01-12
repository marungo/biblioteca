package biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BibliotecaAppTest {

    @Test
    public void shouldDisplayWelcomeMessage() {
        PrintStream printStream = mock(PrintStream.class);
        BibliotecaApp.displayWelcomeMessage(printStream);
        String message = "Welcome to biblioteca! We are open for service.";
        verify(printStream).println(message);
    }
}