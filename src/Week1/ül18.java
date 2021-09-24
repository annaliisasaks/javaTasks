package Week1;

import java.util.Scanner;

public class ül18 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type the points [0-60]: ");
        int typedPoints = Integer.parseInt(reader.nextLine());
        String grade = "";

        if(0>typedPoints || typedPoints>60) {
            grade="-";
        } else if (typedPoints<30) {
            grade = "failed";
        } else if (typedPoints<35) {
            grade="1";
        } else if(typedPoints<40) {
            grade="2";
        }else if(typedPoints<45) {
            grade="3";
        }else if( typedPoints<50) {
            grade="4";
        }else {
            grade="5";
        }
        System.out.println("Grade:  " + grade);
    }

}
