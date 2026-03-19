package practice1;

import java.util.Scanner;

public class QuadraticRoots {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Error");
            sc.close();
            return;
        }

        double d = b * b - 4 * a * c;

        if (d < 0) {
            System.out.println("Error");
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);

            System.out.println(x1);
            System.out.println(x2);
        }

        sc.close();
    }
}
