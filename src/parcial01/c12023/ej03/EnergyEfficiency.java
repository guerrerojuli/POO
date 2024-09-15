package parcial01.c12023.ej03;

public enum EnergyEfficiency {
    A(0),
    B(10),
    C(20);

    private final double taxPercentage;

    EnergyEfficiency(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public double getTax(double price) {
        return price * (taxPercentage / 100);
    }

    @Override
    public String toString() {
        return "Energy Label %s".formatted(super.toString());
    }
}
