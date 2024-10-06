package tp07.ej05;

import java.util.*;

public class IterableBagImpl<T extends Comparable<? super T>> extends BagImpl<T> implements IterableBag<T> {
    public IterableBagImpl() {
        bag = new TreeMap<>(Comparator.reverseOrder());
    }

    @Override
    public Iterable<T> elements() {
        ArrayList<T> elements = new ArrayList<>();
        for (Map.Entry<T, Integer> entry : bag.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                elements.add(entry.getKey());
            }
        }
        return elements;
    }

    @Override
    public Iterable<T> elementsDistinct() {
        return bag.keySet();
    }

}