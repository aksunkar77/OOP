package problem2;

public class Main {
    public static void main(String[] args) {

        BankAccount a = new BankAccount("Aksu", AccountType.STUDENT);
        BankAccount b = new BankAccount("Naraa");

        a.deposit(500);
        a.deposit(2000);
        a.deposit(10, true);

        a.transferTo(b, 1500);

        System.out.println(BankAccount.BANK_NAME);
        System.out.println("A id=" + a.getId() + " bal=" + a.getBalance() + " type=" + a.getType());
        System.out.println("B id=" + b.getId() + " bal=" + b.getBalance() + " type=" + b.getType());

        BankAccount.exchangeRateKZTtoUSD = 0.0020;
        a.deposit(10, true);

        System.out.println("A after rate change bal=" + a.getBalance());
    }
}

