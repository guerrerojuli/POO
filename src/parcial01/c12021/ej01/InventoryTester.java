package parcial01.c12021.ej01;

import java.util.Arrays;

public class InventoryTester {
    public static void main(String[] args) {
        Item item1 = new Item("A", 100.0);
        Item item2 = new Item("B1", 200.0);
        Item item3 = new Item("B2", 200.0);

        Item[] items = new Item[]{item3, item1, item2};

        Inventory inventory = new Inventory(items);

        // Orden natural: ascendente por precio y desempata alfabéticamente por nombre
        Item[] itemsByPriceAsc = inventory.getItems();
        System.out.println(Arrays.toString(itemsByPriceAsc));
        System.out.println("----------");

        // Orden: descendente por precio y desempata alfabéticamente por nombre
        Item[] itemsByPriceDesc = inventory.getItems((i1, i2) -> {
            int cmp = Double.compare(i2.getPrice(), i1.getPrice());
            if (cmp == 0)   cmp = i1.getName().compareTo(i2.getName());
            return cmp;
        });
        System.out.println(Arrays.toString(itemsByPriceDesc));
        System.out.println("----------");

        // Orden: alfabético por nombre y desempata ascendente por precio
        Item[] itemsByNameAsc = inventory.getItems((i1, i2) -> {
            int cmp = i1.getName().compareTo(i2.getName());
            if (cmp == 0)   cmp = Double.compare(i1.getPrice(), i2.getPrice());
            return cmp;
        });
        System.out.println(Arrays.toString(itemsByNameAsc));
        System.out.println("----------");
    }
}
