package tp07.ej03;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ConcatIterator<T> implements Iterator<T> {
    private final Iterator<T> it1, it2;

    public ConcatIterator(Iterator<T> it1, Iterator<T> it2) {
        this.it1 = it1;
        this.it2 = it2;
    }

    @Override
    public boolean hasNext() {
        return (it1.hasNext() || it2.hasNext());
    }

    @Override
    public T next() {
        if (!it1.hasNext()) {
            if (!it2.hasNext()) throw new NoSuchElementException();
            return it2.next();
        }
        return it1.next();
    }
}
