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
        } else if (0<=typedPoints && typedPoints<30) {
            grade = "failed";
        } else if (30<=typedPoints && typedPoints<35) {
            grade="1";
        } else if(35<=typedPoints && typedPoints<40) {
            grade="2";
        }else if(40<=typedPoints && typedPoints<45) {
            grade="3";
        }else if(45<=typedPoints && typedPoints<50) {
            grade="4";
        }else if(50<=typedPoints && typedPoints<61) {
            grade="5";
        }
        System.out.println("Grade:  " + grade);
    }

}
