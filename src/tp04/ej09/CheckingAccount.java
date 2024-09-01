package tp04.ej09;

public class CheckingAccount extends BankAccount {
    private double overdraft;

    public CheckingAccount(int id, double overdraft) {
        super(id);
        this.overdraft = overdraft;
    }

    @Override
    protected boolean canExtract(double amount) {
        return this.overdraft >= (amount - getBalance());
    }

    public double getOverdraft() {
        return this.overdraft;
    }
}
