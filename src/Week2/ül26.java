package Week2;

import java.util.Scanner;

public class ül26 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Insert number: ");
        int sum = 0;

        while (true) {
            int typedNr = Integer.parseInt(reader.nextLine());
            if (typedNr == 0) {
                break;
            }

            sum = sum + typedNr;

            System.out.println("Sum now: " + sum);
        }

        System.out.println("Sum in the end: " + sum);

    }

}
