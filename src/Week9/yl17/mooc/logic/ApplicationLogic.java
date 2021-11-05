package Week9.yl17.mooc.logic;

import Week9.yl17.mooc.ui.UserInterface;


public class ApplicationLogic {
    private UserInterface ui;

    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }

    public void execute(int howManyTimes) {

        for (int count = 0; count < howManyTimes; count++) {
            System.out.println("The application logic works");

            this.ui.update();
        }
    }
}
