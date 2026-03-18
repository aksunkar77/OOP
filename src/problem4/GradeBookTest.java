package problem4;

import java.util.Scanner;
import problem4.Student;

public class GradeBookTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Course c = new Course(
                "CS101",
                "Object-Oriented Programming",
                5,
                "None"
        );

        GradeBook gb = new GradeBook(c, 10);

        for (int i = 0; i < 10; i++) {

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Id: ");
            int id = sc.nextInt();

            System.out.print("Grade: ");
            int g = sc.nextInt();

            Student s = new Student(name, id, g);

            gb.addStudent(s);
        }

        gb.displayMessage();
        gb.displayGradeReport();

        sc.close();
    }
}
