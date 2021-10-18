package Week4.BoundedCounter;

import Week4.NumberStatistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics statsEven = new NumberStatistics();
        NumberStatistics statsOdd = new NumberStatistics();

        int userNumber = 0;

        System.out.print("Type numbers: ");

        while (true) {
            userNumber = Integer.parseInt(scanner.nextLine());
            if (userNumber==-1) {
                break;
            } else if (userNumber %2 ==0) {
                stats.addNumber(userNumber);
                statsEven.addNumber(userNumber);
            } else {
                stats.addNumber(userNumber);
                statsOdd.addNumber(userNumber);
            }
        }

        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + statsEven.sum());
        System.out.println("sum of odd: " + statsOdd.sum());

    }
}
