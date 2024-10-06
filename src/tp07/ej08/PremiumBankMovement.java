package tp07.ej08;

public class PremiumBankMovement extends BankMovement {
    private final String shop;

    public PremiumBankMovement(MovementType type, double amount, String shop) {
        super(type, amount);
        this.shop = shop;
    }

    @Override
    public String toString() {
        return String.format("%s for shop %s", super.toString(), shop);
    }
}
