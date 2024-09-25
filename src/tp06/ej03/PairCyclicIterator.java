package tp06.ej03;


import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class PairCyclicIterator<T> implements Iterator<Pair<T>> {
    private final Collection<T> collection;
    private Iterator<T> iterator;

    public PairCyclicIterator(Collection<T> collection) {
        this.collection = collection;
        this.iterator = collection.iterator();
    }

    @Override
    public boolean hasNext() {
        return collection.iterator().hasNext();
    }

    @Override
    public Pair<T> next() {
        if (!hasNext()) throw new NoSuchElementException();
        T e1, e2;
        if (!iterator.hasNext())    iterator = collection.iterator();
        e1 = iterator.next();
        if (!iterator.hasNext())    iterator = collection.iterator();
        e2 = iterator.next();
        return new Pair<>(e1, e2);
    }
}
