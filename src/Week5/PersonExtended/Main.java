package Week5.PersonExtended;

public class Main {
    public static void main(String[] args) {
        // write test code here
        // Person pekka = new Person("Pekka", 15, 2, 1993);
        Person pekka = new Person("Pekka", new MyDate(31,12,2009));
        Person steve = new Person("Steve");
        Person chris = new Person("Christopher", new MyDate(1,1,2010));

        System.out.println( pekka );
        System.out.println( steve );

        System.out.println();
        System.out.println("Who's older? ");
        boolean P;

        if (pekka.olderThan(steve)) {
            P = true;
            System.out.println(pekka);
        } else {
            System.out.println(steve);
            P = false;
        }

        if (P) {
            System.out.println(chris);
            System.out.println();
            System.out.println("Who's older? ");

            boolean second;
            if (pekka.olderThan(chris)) {
                second = true;
                System.out.println(pekka);
            } else {
                System.out.println(chris);
                second = false;
            }
        } else {
            System.out.println(chris);
            System.out.println("Who's older? ");

            boolean second;
            if (steve.olderThan(chris)) {
                second = true;
                System.out.println(steve);
            } else {
                System.out.println(chris);
                second = false;
            }
        }
    }
}
