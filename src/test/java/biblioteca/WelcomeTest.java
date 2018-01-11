package biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;
import static org.mockito.Mockito.*;


import static org.junit.Assert.*;

public class WelcomeTest {
    private PrintStream printStream;
    private BufferedReader bufferedReader;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
    }

    @Test
    public void testWelcomeMessageDisplays() {
        Welcome.displayWelcomeMessage(printStream);
        String message = "Welcome to biblioteca! We are open for service.";
        verify(printStream).println(message);
    }

}