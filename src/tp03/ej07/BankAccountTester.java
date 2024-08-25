package tp03.ej07;

public class BankAccountTester {
    public static void main(String[] args) {
        CheckingAccount myCheckingAccount = new CheckingAccount(1001, 50);
        myCheckingAccount.deposit(100.0);
        System.out.println(myCheckingAccount);
        myCheckingAccount.extract(150.0);
        System.out.println(myCheckingAccount);

        SavingsAccount mySavingsAccount = new SavingsAccount(1002);
        mySavingsAccount.deposit(100.0);
        System.out.println(mySavingsAccount);
        mySavingsAccount.extract(150.0); // No se realiza por falta de fondos
        System.out.println(mySavingsAccount);

        BankAccount myBankAccount1 = new SavingsAccount(1002);
        // SavingsAccount myBankAccount2 = new BankAccount(1002);
        BankAccount myBankAccount3 = new SavingsAccount(1002);
        System.out.println(myBankAccount3.getClass());
        BankAccount myBankAccount4 = new CheckingAccount(1002, 50);
        // System.out.println(myBankAccount4.getOverdraft());
        System.out.println(((CheckingAccount) myBankAccount4).getOverdraft());
    }

}
