package tp07.ej06;

import java.util.*;

public class MultiMapImpl<K, V extends Comparable<? super V>> implements MultiMap<K, V> {
    private final Map<K, Set<V>> multiMap = new HashMap<>();
    private int size = 0;

    @Override
    public void put(K key, V value) {
        multiMap.putIfAbsent(key, new TreeSet<>(Comparator.reverseOrder()));
        if (!multiMap.get(key).contains(value)) {
            multiMap.get(key).add(value);
            size++;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public int size(K key) {
        return multiMap.getOrDefault(key, new TreeSet<>()).size();
    }

    @Override
    public void remove(K key) {
        Set<V> removed = multiMap.remove(key);
        if (removed != null)    size -= removed.size();
    }

    @Override
    public void remove(K key, V value) {
        boolean removed = multiMap.getOrDefault(key, new TreeSet<>()).remove(value);
        if (removed)    size--;
    }

    @Override
    public Iterable<V> get(K key) {
        return multiMap.get(key);
    }
}
