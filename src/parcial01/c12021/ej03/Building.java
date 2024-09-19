package parcial01.c12021.ej03;

public class Building {
    // Costo por metro cuadrado de las U.F. residenciales y comerciales
    private double m2Expense = 100.0;
    // Multiplicador sobre total para las U.F. comerciales
    private double commercialMult = 3.0;
    // Cargo extra por ambiente sobre total para las U.F. residenciales
    private double residentialRoomExpense = 200.0;

    public double getM2Expense() {
        return m2Expense;
    }

    public void setM2Expense(double m2Expense) {
        this.m2Expense = m2Expense;
    }

    public double getCommercialMult() {
        return commercialMult;
    }

    public void setCommercialMult(double commercialMult) {
        this.commercialMult = commercialMult;
    }

    public double getResidentialRoomExpense() {
        return residentialRoomExpense;
    }

    public void setResidentialRoomExpense(double residentialRoomExpense) {
        this.residentialRoomExpense = residentialRoomExpense;
    }

    public FunctionalUnit newCommercialFunctionalUnit(String name, int m2) {
        return new CommercialUnit(name, m2, this);
    }

    public FunctionalUnit newResidentialFunctionalUnit(String name, int m2, int amb) {
        return new ResidentialUnit(name, m2, amb, this);
    }

}
