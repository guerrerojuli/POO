package tp07.ej08;

import java.util.ArrayList;

public class Bank {
    ArrayList<BankAccount> banks = new ArrayList<>();

    public void addAccount(BankAccount acc) {
        banks.add(acc);
    }

    public int accountSize() {
        return banks.size();
    }

    public void removeAccount(BankAccount acc) {
        banks.remove(acc);
    }

    public double totalAmount() {
        double amount = 0;
        for (BankAccount bank : banks) amount += bank.getBalance();
        return amount;
    }
}
