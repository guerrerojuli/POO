package tp03.ej07;

public abstract class BankAccount {
    private int id;
    private double balance;

    public BankAccount(int id) {
        this.id = id;
        this.balance = 0;
    }

    public double getBalance() {
        return this.balance;
    }

    protected abstract boolean canExtract(double amount);

    public void extract(double amount) {
        if (!canExtract(amount)) return;
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public String toString() {
        return "ID: " + this.id + " Balance: " + this.balance;
    }
}
