package Week1;

import java.util.Scanner;

public class ül21 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String leapOrNot = "";

        System.out.print("Type a year: ");
        int typedYear = Integer.parseInt(reader.nextLine());

        if(typedYear%100==0 && typedYear%400==0) {
            leapOrNot = " ";
        } else if(typedYear%100==0 && typedYear%400!=0) {
            leapOrNot = " not ";
        } else if (typedYear%4==0) {
            leapOrNot = " ";
        } else {
            leapOrNot = " not ";
        }
        System.out.println("The year is" + leapOrNot + "a leap year");
    }

}
