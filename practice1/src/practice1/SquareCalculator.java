package practice1;

import java.util.Scanner;

public class SquareCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();

        double area = a * a;
        double perimeter = 4 * a;
        double diagonal = a * Math.sqrt(2);

        System.out.println(area);
        System.out.println(perimeter);
        System.out.println(diagonal);

        sc.close();
    }
}

