package parcial01.c12021.ej01;

import java.util.Comparator;
import java.util.Arrays;

public class Inventory {
    private final Item[] items;

    public Inventory(Item[] items) {
        this.items = items;
    }

    public Item[] getItems() {
        return getItems(Comparator.naturalOrder());
    }

    public Item[] getItems(Comparator<Item> comparator) {
        Item[] copy = Arrays.copyOf(items, items.length);
        Arrays.sort(copy, comparator);
        return copy;
    }
}
