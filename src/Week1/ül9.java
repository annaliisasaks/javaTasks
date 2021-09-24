package Week1;

import java.util.Scanner;

public class ül9 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());

        System.out.println("Division: " + firstNumber + "/" + secondNumber + "=" + (double)firstNumber/secondNumber);

        System.out.println("Anna-Liisa Saks");

    }

}
