package Week3;
import java.util.Scanner;
import java.util.ArrayList;

public class ül57 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            if (word.equals("")) {
                break;
            } else {
                words.add(word);
            }
        }

        System.out.println("You typed the following words:");
        for (String word : words
        ) {
            System.out.println(word);
        }
    }
}
