package tp07.ej08;

import java.util.*;

public class ShopDiscountsProvider {
    private final Map<String, Double> discounts = new HashMap<>();

    public void addShop(String shop, double discount) {
        this.discounts.put(shop, discount);
    }

    public double getDiscount(String shop) {
        return discounts.getOrDefault(shop, 0.0);
    }
}
