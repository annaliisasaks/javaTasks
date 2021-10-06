package Week3;
import java.util.Scanner;

public class ül69 {
    public static void main(String args[])
    {
        String original, reverse = ""; // Objects of String class
        Scanner in = new Scanner(System.in);
        System.out.println("Type a text: ");
        original = in.nextLine();
        int length = original.length();
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);
        if (original.equals(reverse))
            System.out.println("The text is a palindrome.");
        else
            System.out.println("The text isn't a palindrome.");
    }

}
