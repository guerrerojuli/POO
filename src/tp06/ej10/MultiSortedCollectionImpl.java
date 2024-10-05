package tp06.ej10;

import java.util.*;

public class MultiSortedCollectionImpl<T> implements MultiSortedCollection<T> {
    private final Set<T> values = new HashSet<>();
    private final Map<Comparator<T>, Set<T>> collections = new HashMap<>();

    @Override
    public void add(Comparator<T> comp) {
        Set<T> set = new TreeSet<>(comp);
        set.addAll(values);
        collections.put(comp, set);
    }

    @Override
    public void add(T elem) {
        values.add(elem);
        collections.values().forEach(set -> set.add(elem));
    }

    @Override
    public void remove(T elem) {
        values.remove(elem);
        collections.values().forEach(set -> set.remove(elem));
    }

    @Override
    public Iterable<T> iterable(Comparator<T> comp) {
        if (!collections.containsKey(comp)) {
            throw new IllegalArgumentException();
        }
        return collections.get(comp);

    }
}
