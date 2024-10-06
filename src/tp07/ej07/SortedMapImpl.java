package tp07.ej07;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class SortedMapImpl<K extends Comparable<? super K>, V> extends TreeMap<K, V> implements SortedMap<K, V> {
    @Override
    public V firstValue() {
        return get(firstKey());
    }

    @Override
    public Iterator<Map.Entry<K, V>> iterator() {
        return super.entrySet().iterator();
    }
}
