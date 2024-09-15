package parcial01.c12023.ej03;

public abstract class Product {
    private final String name;
    private final Brand brand;
    private final double price;

    public Product(String name, Brand brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public double getFinalPrice() {
        return brand.applyDiscount(price);
    }

    public double getFinalPrice(Warranty warranty) {
        return getFinalPrice() + warranty.getCost(price);
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "%s from %s with price $%.2f with ".formatted(name, brand, price);
    }
}
