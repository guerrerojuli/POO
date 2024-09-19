package parcial01.c12021.ej03;

public class ResidentialUnit extends FunctionalUnit {
    private final int amb;
    public ResidentialUnit(String name, int m2, int amb, Building building) {
        super(name, m2, building);
        this.amb = amb;
    }

    @Override
    public double getExpense() {
        return super.getExpense() + amb * getBuilding().getResidentialRoomExpense();
    }

    @Override
    public String toString() {
        return String.format("Residencial: %s", super.toString());
    }
}
