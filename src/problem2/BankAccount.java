package problem2;

public class BankAccount {
	 public static final String BANK_NAME = "KBTU Bank";
	    public static final double MIN_DEPOSIT = 1000;

	    public static double exchangeRateKZTtoUSD = 0.0022;

	    private static int nextId = 1;

	    private final int id;
	    private final String owner;
	    private final AccountType type;

	    private double balance;

	    {
	        balance = 0;
	    }

	    public BankAccount(String owner, AccountType type) {
	        this.id = nextId++;
	        this.owner = owner;
	        this.type = type;
	    }

	    public BankAccount(String owner) {
	        this(owner, AccountType.STANDARD);
	    }

	    public int getId() {
	        return id;
	    }

	    public String getOwner() {
	        return owner;
	    }

	    public AccountType getType() {
	        return type;
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public void deposit(double amount) {
	        if (amount < MIN_DEPOSIT) return;
	        balance += amount;
	    }

	    public void deposit(double amount, boolean inUSD) {
	        if (inUSD) {
	            this.deposit(amount / exchangeRateKZTtoUSD);
	        } else {
	            this.deposit(amount);
	        }
	    }

	    public boolean withdraw(double amount) {
	        if (amount <= 0) return false;
	        if (amount > balance) return false;
	        balance -= amount;
	        return true;
	    }

	    public void transferTo(BankAccount other, double amount) {
	        if (other == null) return;
	        if (this.withdraw(amount)) {
	            other.deposit(amount);
	        }
	    }
}