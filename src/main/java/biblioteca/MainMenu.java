package biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;

public class MainMenu {
    private ArrayList<String> options;
    private Biblioteca biblioteca;

    public MainMenu(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
        options = new ArrayList<>();
        options.add("List Books");
    }

    public ArrayList<String> getOptions() {
        return options;
    }

    public void display(PrintStream printStream) {
        StringBuilder result = new StringBuilder();
        result.append("Main Menu\n");
        for(String option : options){
            result.append("\t"+ option + "\n");
        }
        printStream.println(result.toString());
    }

    public void select(String option) {
        if(option.equals("List Books"))
            biblioteca.run();
    }
}
