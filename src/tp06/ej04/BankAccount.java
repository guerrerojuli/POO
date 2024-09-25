package tp06.ej04;

public abstract class BankAccount {
    private final int id;
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

    @Override
    public boolean equals(Object that) {
        return that instanceof BankAccount thatAcc && thatAcc.id == this.id;
    }
}
