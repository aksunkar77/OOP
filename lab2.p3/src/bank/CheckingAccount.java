package bank;

public class CheckingAccount extends Account {
    private int transactionCount;
    public static final int FREE_TRANSACTIONS = 3;

    public CheckingAccount(int a) {
        super(a);
        transactionCount = 0;
    }

    @Override
    public void deposit(double sum) {
        if (sum > 0) {
            super.deposit(sum);
            transactionCount++;
        }
    }

    @Override
    public void withdraw(double sum) {
        if (sum > 0 && sum <= getBalance()) {
            super.withdraw(sum);
            transactionCount++;
        }
    }

    public void deductFee() {
        if (transactionCount > FREE_TRANSACTIONS) {
            int extra = transactionCount - FREE_TRANSACTIONS;
            double fee = extra * 0.02;
            super.withdraw(fee);
        }
        transactionCount = 0;
    }

    @Override
    public String toString() {
        return "CheckingAccount number: " + getAccountNumber()
                + ", balance: " + getBalance()
                + ", transactions: " + transactionCount;
    }
}