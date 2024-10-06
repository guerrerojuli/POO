package tp07.ej08;

public class BankMovement {
    private final MovementType type;
    private final double amount;

    public BankMovement(MovementType type, double amount) {
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("%s $%.1f", type, amount);
    }

    public double getAmount() {
        return amount;
    }

    public MovementType getType() {
        return type;
    }
}
