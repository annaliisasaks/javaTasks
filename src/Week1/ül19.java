package Week1;

import java.util.Scanner;

public class ül19 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("How old are you? ");
        int typedAge = Integer.parseInt(reader.nextLine());


        if(0>typedAge || typedAge>120) {
            System.out.println("Impossible!");
        } else {
            System.out.println("OK");
        }
    }

}
