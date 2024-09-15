package parcial01.c12023.ej03;

public class Accessory extends Product {
    private final String description;

    public Accessory(String name, Brand brand, double price, String description) {
        super(name, brand, price);
        this.description = description;
    }

    @Override
    public String toString() {
        return "[Accessory] " + super.toString() + "feature %s".formatted(description);
    }
}
