package Week1;

import java.util.Scanner;

public class ül16 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int typedNumber = Integer.parseInt(reader.nextLine());
        String evenOrOdd = typedNumber%2==0 ? "even" : "odd";

        System.out.println("Number "+typedNumber+" is " + evenOrOdd);
    }

}
