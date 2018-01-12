package biblioteca;

import java.io.PrintStream;

public class BibliotecaApp {

    static PrintStream printStream = System.out;

    public static void main(String[] args) {
        displayWelcomeMessage(printStream);
        MainMenu mainMenu = new MainMenu();
        mainMenu.display(printStream);
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.run();

    }

    public static void displayWelcomeMessage(PrintStream printStream) {
        printStream.println("Welcome to biblioteca! We are open for service.");
    }
}
