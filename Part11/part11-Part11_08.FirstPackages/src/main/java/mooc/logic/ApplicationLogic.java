package mooc.logic;

import mooc.ui.UserInterface;

public class ApplicationLogic {

    private final UserInterface ui;

    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }

    public void execute(int times) {
        String schema = "Application logic is working";
        for (int i = 0; i < times; i++) {
            System.out.println(schema);
            ui.update();
        }
    }
}
