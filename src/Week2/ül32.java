package Week2;
import java.util.Scanner;
public class ül32 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Until what? ");
        int upTo = Integer.parseInt(reader.nextLine());
        int sum = 0;
        for(int i=0; i <= upTo; i++) {
            sum += i;
        }
        System.out.println("Sum is " + sum);

    }
}
