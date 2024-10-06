package tp07.ej08;

public class PremiumAccount extends CheckingAccount {
    private final ShopDiscountsProvider provider;

    public PremiumAccount(int id, double overdraft, ShopDiscountsProvider provider) {
        super(id, overdraft);
        this.provider = provider;
    }

    public void extract(double amount, String shop) {
        super.extract(new PremiumBankMovement(MovementType.EXTRACTION, amount * (1 - provider.getDiscount(shop)), shop));
    }
}
