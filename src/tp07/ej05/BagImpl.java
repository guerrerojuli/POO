package tp07.ej05;

import tp06.ej08.Bag;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class BagImpl<T> implements Bag<T> {
    protected Map<T, Integer> bag;
    private int size = 0;

    public BagImpl() {
        bag = new HashMap<>();
    }

    @Override
    public void add(T item) {
        /* merge coloca si es null */
        bag.merge(item, 1, Integer::sum);
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
