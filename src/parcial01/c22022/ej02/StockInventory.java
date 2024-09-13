package parcial01.c22022.ej02;

import java.util.Iterator;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.function.Predicate;

public class StockInventory implements Iterable<StockResult> {
    private StockProduct[] products;
    private int productsSize;
    private Predicate<Integer> alertCondition;
    private final static int INIT_DIM = 20;

    public StockInventory() {
        products = new StockProduct[INIT_DIM];
        setMinimumStock(new Predicate<Integer>() {
            @Override
            public boolean test(Integer stock) {
                return stock <= 1;
            }
        });
    }

    public void add(String name, int stock) {
        if (productsSize == products.length) {
            products = Arrays.copyOf(products, productsSize + INIT_DIM);
        }
        products[productsSize++] = new StockProduct(name, stock);
    }

    public void reduceStock(String name) {
        for (int i = 0; i < productsSize; i++) {
            StockProduct product = products[i];
            if (product.getProduct().equals(name)) {
                product.reduceStock();
                return;
            }
        }
        throw new IllegalArgumentException("No product found with name %s".formatted(name));
    }

    public void setMinimumStock(Predicate<Integer> alertCondition) {
        this.alertCondition = alertCondition;
    }

    @Override
    public Iterator<StockResult> iterator() {
        return new Iterator<StockResult>() {
            private int current_idx = 0;
            private final Predicate<Integer> condition = alertCondition;

            @Override
            public boolean hasNext() {
                return current_idx < productsSize;
            }

            @Override
            public StockResult next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                StockProduct current = products[current_idx++];
                return new StockResult(current, condition.test(current.getStock()));
            }
        };
    }
}
