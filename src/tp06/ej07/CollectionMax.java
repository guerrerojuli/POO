package tp06.ej07;

import java.util.Collection;

public class CollectionMax<E extends Comparable<? super E>> {
    public E max(Collection<E> values) {
        if (values == null)  return null;
        E max = null;
        for (E elem : values) {
            if (max == null || elem.compareTo(max) > 0)    max = elem;
        }
        return max;
    }

}
