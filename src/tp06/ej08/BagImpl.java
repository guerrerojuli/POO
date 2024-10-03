package tp06.ej08;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class BagImpl<T> implements Bag<T> {
    private final Map<T, Integer> bag = new HashMap<>();
    private int size = 0;

    @Override
    public void add(T item) {
        /* merge coloca si es null */
        bag.merge(item, 1, (v1, v2) -> v1 + v2);
        size++;
    }

    @Override
    public int count(T item) {
        return bag.getOrDefault(item, 0);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int sizeDistinct() {
        return bag.size();
    }

    @Override
    public boolean contains(T item) {
        return bag.containsKey(item);
    }

    @Override
    public void remove(T item) {
        /* más eficiente que hacer containsKey y get? */
        Integer value = bag.get(item);
        if (value == null)  throw new NoSuchElementException();
        if (value == 1) bag.remove(item);
        else bag.put(item, value - 1);
    }

}
