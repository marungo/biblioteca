package biblioteca;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MainMenuTest {
    @Test
    public void shouldContainListOfBooks(){
        MainMenu mainMenu = new MainMenu();
        Boolean result = mainMenu.getOptions().contains("List Books");
        assertThat(result, is(true));
    }

}