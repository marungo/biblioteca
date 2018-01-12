package biblioteca;

import java.io.PrintStream;

public class BibliotecaApp {

    static PrintStream printStream = System.out;

    public static void main(String[] args) {
        displayWelcomeMessage(printStream);
        Biblioteca biblioteca = new Biblioteca();
        MainMenu mainMenu = new MainMenu(biblioteca, printStream);
        mainMenu.start();


        //biblioteca.run();

    }

    public static void displayWelcomeMessage(PrintStream printStream) {
        printStream.println("Welcome to biblioteca! We are open for service.");
    }
}
