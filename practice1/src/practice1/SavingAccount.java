package practice1;

import java.util.Scanner;

public class SavingAccount {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = sc.nextDouble();
        double rate = sc.nextDouble();
        int months = sc.nextInt();

        double monthlyRate = rate / 100 / 12;

        double interest = balance * monthlyRate * months;

        double newBalance = balance + interest;

        System.out.println(newBalance);

        sc.close();
    }
}
