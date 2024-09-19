package parcial01.c12021.ej03;

public abstract class FunctionalUnit {
    private final String name;
    private final int m2;
    private final Building building;

    public FunctionalUnit(String name, int m2, Building building) {
        this.name = name;
        this.m2 = m2;
        this.building = building;
    }

    public double getExpense() {
        return m2 * building.getM2Expense();
    }

    public Building getBuilding() {
        return building;
    }

    @Override
    public String toString() {
        return String.format("U. F. %s ( %d m2 ) : $%.2f", name, m2, getExpense());
    }
}
