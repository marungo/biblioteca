package biblioteca;

import org.junit.Test;

import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class BookTest {

    @Test
    public void shouldDisplayBookDetailsInColumn() {
        Book book = new Book("Harry Potter", "J.K. Rowling", "1990");

        String expectedString = "Harry Potter | J.K. Rowling | 1990\n";

        assertThat(book.toString(), is(expectedString));
    }
}