package Week3;
import java.util.Scanner;

public class ül56 {
    public static String reverse(String text) {
        int i = text.length() - 1;
        String reverseText = "";
        while (i >= 0) {
            reverseText = reverseText + text.charAt(i);
            i--;
        }
        return reverseText;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
