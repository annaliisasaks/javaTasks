package Week3;

import java.util.Scanner;

public class ül53 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a word: ");
        String word = reader.nextLine();

        System.out.print("Length of the first part: ");
        int length = Integer.parseInt(reader.next());

        System.out.println(word.substring(0, length));
    }
}