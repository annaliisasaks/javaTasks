package Week1;

import java.util.Scanner;

public class ül22 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        for(int i = 0; i<3; i++) {
            System.out.print("Type the password: ");
            String typedPassword = reader.nextLine();
            System.out.println(typedPassword);
            if (typedPassword.equals("carrot")) {
                System.out.println("Right!\nThe secret is: tbbq wbo!");
                break;
            } else {
                System.out.println("Wrong!");
            }


        }

    }

}
