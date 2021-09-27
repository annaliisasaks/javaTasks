package Week2;
import java.util.Scanner;

public class ül30 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Up to what number? ");
        int typedNumber = Integer.parseInt(reader.nextLine());
        int printNumber = 1;
        while(typedNumber>=printNumber) {
            System.out.println(printNumber);
            printNumber ++;
        }
    }
}
