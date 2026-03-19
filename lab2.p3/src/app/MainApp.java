package app;

import bank.Account;
import bank.Bank;
import bank.CheckingAccount;
import bank.SavingsAccount;

public class MainApp {
    public static void main(String[] args) {

        Bank bank = new Bank();

        Account a1 = new Account(1001);
        SavingsAccount a2 = new SavingsAccount(1002, 5.0);
        CheckingAccount a3 = new CheckingAccount(1003);

        a1.deposit(500);
        a2.deposit(1000);

        a3.deposit(200);
        a3.withdraw(50);
        a3.deposit(100);
        a3.withdraw(20);
        a3.deposit(30);

        bank.openAccount(a1);
        bank.openAccount(a2);
        bank.openAccount(a3);

        System.out.println("Before update:");
        bank.printAccounts();

        bank.update();

        System.out.println();
        System.out.println("After update:");
        bank.printAccounts();

        a1.transfer(100, a2);

        System.out.println();
        System.out.println("After transfer:");
        bank.printAccounts();

        bank.closeAccount(1001);

        System.out.println();
        System.out.println("After closing account 1001:");
        bank.printAccounts();
    }
}
