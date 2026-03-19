package bank;

public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int a, double rate) {
        super(a);
        interestRate = rate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100.0;
        deposit(interest);
    }

    @Override
    public String toString() {
        return "SavingsAccount number: " + getAccountNumber()
                + ", balance: " + getBalance()
                + ", interest rate: " + interestRate + "%";
    }
}