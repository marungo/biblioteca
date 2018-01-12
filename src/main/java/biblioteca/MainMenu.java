package biblioteca;

import java.util.ArrayList;

public class MainMenu {
    private ArrayList<String> options;

    public MainMenu() {
        options = new ArrayList<>();
        options.add("List Books");
    }

    public ArrayList<String> getOptions() {
        return options;
    }
}
