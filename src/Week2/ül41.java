package Week2;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Scanner;

public class ül41 {
    public static void drawNumber(int typedNumber, int randomNum) {
        Scanner reader = new Scanner(System.in);
        while (true) {
        if (typedNumber == randomNum) {
            System.out.println("Right guess!");
            return;
        } else if (typedNumber < randomNum) {
            System.out.println("The number is greater.");
        } else {
            System.out.println("The number is lesser.");
        }
            System.out.print("Type again: ");
            typedNumber = Integer.parseInt(reader.nextLine());
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int typedNumber = Integer.parseInt(reader.nextLine());
        int randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);
        drawNumber(typedNumber, randomNum);
    }
}