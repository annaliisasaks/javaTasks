package Week4.PasswordRandomizer;

import java.util.Random;

public class PasswordRandomizer {
    // define the variables here
    private int pwLength;
    private Random random;

    public PasswordRandomizer(int length) {
        // format the variable here
        this.pwLength = length;
        random = new Random();
    }

    public String createPassword() {
        // returns the new password
        String newPW = "";
        int nextRandomNum = 0;

        for (int currentPosition = 0; currentPosition < this.pwLength; currentPosition++) {
            nextRandomNum = this.random.nextInt(25);
            char symbol = "abcdefghijklmnopqrstuvwxyz".charAt(nextRandomNum);
            newPW+=symbol;
        }
        return newPW;

    }
}
