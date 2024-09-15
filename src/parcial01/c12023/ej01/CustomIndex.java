package parcial01.c12023.ej01;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.UnaryOperator;

public class CustomIndex<T> implements Iterable<T> {
    private final T[] array;
    private final int first;
    private final int last;
    private UnaryOperator<Integer> nextIndexFunc;

    public CustomIndex(T[] array, int first, int last, UnaryOperator<Integer> nextIndexFunc) {
        if (first > last) throw new RuntimeException("Invalid combination of start and end index");
        this.array = array;
        this.first = first;
        this.last = last;
        setNextIndex(nextIndexFunc);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int current = first;
            private final UnaryOperator<Integer> nextIndex = nextIndexFunc;

            @Override
            public boolean hasNext() {
                return current <= last;
            }

            @Override
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T toReturn = array[current];
                current = nextIndex.apply(current);
                return toReturn;
            }
        };
    }

    public void setNextIndex(UnaryOperator<Integer> nextIndexFunc) {
        this.nextIndexFunc = nextIndexFunc;
    }
}
