package Week5.Students;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {                //this main is 88.2
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<Student>();

        while (true) {
            System.out.print("name: ");
            String name = scanner.nextLine();

            if (!name.equals("")) {
                System.out.print("studentnumber: ");
                String studentNumber = scanner.nextLine();

                studentList.add(new Student(name, studentNumber));
            } else {
                System.out.println("");
                for (Student student : studentList) {
                    System.out.println(student);
                }
                break;
            }
        }

        System.out.println("");                        // 88.3
        System.out.print("Give search term: ");
        String search = scanner.nextLine();

        System.out.println("Result: ");

        for (Student student : studentList) {
            String name = student.getName();

            if (name.contains(search)) {
                System.out.println(student);
            }
        }




    }
}
