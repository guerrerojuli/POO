package parcial01.c12023.ej03;

public class Device extends Product {
    private final EnergyEfficiency efficiency;

    public Device(String name, Brand brand, double price, EnergyEfficiency efficiency) {
        super(name, brand, price);
        this.efficiency = efficiency;
    }

    @Override
    public double getFinalPrice() {
        return super.getFinalPrice() + efficiency.getTax(getPrice());
    }

    @Override
    public String toString() {
        return "[Device] " + super.toString() + efficiency.toString();
    }
}
