package problem1;

import java.util.Scanner;

public class Analyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        data d = new data();

        while (true) {

            System.out.print("Enter number (Q to quit): ");
            String s = sc.nextLine();

            if (s.equals("Q") || s.equals("q")) {
                break;
            }

            try {

                double n = Double.parseDouble(s);
                d.add(n);

            } catch (Exception e) {
                System.out.println("Wrong input");
            }
        }

        System.out.println("Average = " + d.getAverage());
        System.out.println("Maximum = " + d.getMax());

        sc.close();
    }
}

