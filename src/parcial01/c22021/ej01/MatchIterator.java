package parcial01.c22021.ej01;

import java.util.NoSuchElementException;
import java.util.function.Predicate;
import java.util.Iterator;

public class MatchIterator<T> implements Iterator<MatchElement<T>> {
    private final T[] array;
    private final Predicate<T> predicate;
    private int current = 0;

    public MatchIterator(T[] array, Predicate<T> predicate) {
        this.array = array;
        this.predicate = predicate;
    }

    @Override
    public boolean hasNext() {
        return current < array.length;
    }

    @Override
    public MatchElement<T> next() {
        if (!hasNext()) throw new NoSuchElementException();
        T element = array[current++];
        return new MatchElement<>(element, predicate.test(element));
    }
}
