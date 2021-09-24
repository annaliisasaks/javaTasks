package Week1;

import java.util.Scanner;

public class ül14 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int typedNumber = Integer.parseInt(reader.nextLine());
        String not = typedNumber>=0 ? " " : " not ";

        System.out.println("The number is"+not+"positive");
    }

}
