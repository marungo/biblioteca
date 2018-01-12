package biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class MainMenu {
    private ArrayList<String> options;
    private Biblioteca biblioteca;
    private PrintStream printStream;

    public MainMenu(Biblioteca biblioteca, PrintStream printStream) {
        this.biblioteca = biblioteca;
        this.printStream = printStream;
        options = new ArrayList<>();
        options.add("List Books");
    }

    private ArrayList<String> getOptions() {
        return options;
    }

    public void start(){
        displayOptions(printStream);
    }

    private void displayOptions(PrintStream printStream) {
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

    public void recieveOption(BufferedReader bufferReader) throws IOException {
        String option  = bufferReader.readLine();
        select(option);
    }
}
