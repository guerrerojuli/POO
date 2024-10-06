package tp07.ej08;

public class PremiumAccountTester {
    public static void main(String[] args) {
        BankAccount checkingAccount = new CheckingAccount(1234, 5000);
        checkingAccount.deposit(200);
        checkingAccount.extract(300);
        checkingAccount.showMovements();

        ShopDiscountsProvider shopDiscountsProvider = new ShopDiscountsProvider();
        shopDiscountsProvider.addShop("Falabella", 0.1D);
        shopDiscountsProvider.addShop("Nike", 0.15D);
        shopDiscountsProvider.addShop("Garbarino", 0.3D);

        PremiumAccount premiumAccount = new PremiumAccount(9999, 5000, shopDiscountsProvider);
        premiumAccount.deposit(1000);
        premiumAccount.extract(150, "Nike");
        premiumAccount.extract(250, "Lacoste");
        premiumAccount.extract(50, "Starbucks");
        premiumAccount.extract(150, "Nike");
        premiumAccount.showMovements();
    }
}
