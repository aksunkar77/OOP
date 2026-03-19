package bank;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<Account>();
    }

    public void openAccount(Account a) {
        accounts.add(a);
    }

    public void closeAccount(int accNumber) {
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).getAccountNumber() == accNumber) {
                accounts.remove(i);
                break;
            }
        }
    }

    public void update() {
        for (int i = 0; i < accounts.size(); i++) {
            Account a = accounts.get(i);

            if (a instanceof SavingsAccount) {
                SavingsAccount s = (SavingsAccount) a;
                s.addInterest();
            } else if (a instanceof CheckingAccount) {
                CheckingAccount c = (CheckingAccount) a;
                c.deductFee();
            }
        }
    }

    public void printAccounts() {
        for (int i = 0; i < accounts.size(); i++) {
            accounts.get(i).print();
        }
    }
}