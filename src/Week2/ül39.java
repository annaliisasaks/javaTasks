package Week2;

public class ül39 {
    private static void printStars(int amount) {
        int i = 0;
        while(i<amount) {
            System.out.print("*");
            i++;
        }
        System.out.println("");

    }
    private static void printRectangle(int width, int height) {
        int i = 0;
        while(i<height) {
            printStars(width);
            i++;
        }
    }
    private static void printTriangle(int size) {
        int i = 1;
        while(i<=size) {
            printStars(i);
            i++;
        }
    }

    public static void main(String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("Rectangle: ");
        printRectangle(17, 3);
        System.out.println("Triangle: ");
        printTriangle(4);
    }

}
