package parcial01.c12021.ej03;

public class CommercialUnit extends FunctionalUnit {
    public CommercialUnit(String name, int m2, Building building) {
        super(name, m2, building);
    }

    @Override
    public double getExpense() {
        return super.getExpense() * getBuilding().getCommercialMult();
    }

    @Override
    public String toString() {
        return String.format("Comercial: %s", super.toString());
    }
}
