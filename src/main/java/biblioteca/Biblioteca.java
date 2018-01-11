package biblioteca;

import java.io.PrintStream;

public class Biblioteca {
    private static PrintStream printStream = System.out;

    public static void main(String[] args) {
        Welcome.displayWelcomeMessage(Biblioteca.printStream);
    }
}
