package tp07.ej08;

import java.util.*;

public abstract class BankAccount {
    private final int id;
    private double balance;
    private final ArrayList<BankMovement> movements = new ArrayList<>();

    public BankAccount(int id) {
        this.id = id;
        this.balance = 0;
    }

    public double getBalance() {
        return this.balance;
    }

    protected abstract boolean canExtract(double amount);

    public void extract(double amount) {
        extract(new BankMovement(MovementType.EXTRACTION, amount));
    }

    protected void extract(BankMovement movement) {
        if (!movement.getType().equals(MovementType.EXTRACTION) || !canExtract(movement.getAmount())) return;
        this.balance -= movement.getAmount();
        movements.add(movement);
    }

    public void deposit(double amount) {
        this.balance += amount;
        movements.add(new BankMovement(MovementType.DEPOSIT, amount));
    }

    public String toString() {
        return "ID: " + this.id + " Balance: " + this.balance;
    }

    @Override
    public boolean equals(Object that) {
        return that instanceof BankAccount thatAcc && thatAcc.id == this.id;
    }

    public void showMovements() {
        System.out.println(String.format("Movements for Account %d", id));
        for (BankMovement movement : movements) {
            System.out.println(movement);
        }
    }
}
