package parcial01.c22023.ej03;

import java.util.Arrays;
import java.util.Comparator;

public class ReportCollectionImpl<T> implements ReportCollection<T> {
    private static final int DIM = 10;
    private int dim;
    private T[] collection = (T[]) new Object[DIM];
    private final Comparator<? super T> comparator;

    public ReportCollectionImpl(Comparator<? super T> cmp) {
        comparator = cmp;
    }

    @Override
    public void add (T report) {
        if (dim == collection.length)   resize();
        collection[dim++] = report;
    }

    @Override
    public T get(int index) {
        if (index >= dim) {
            throw new IllegalArgumentException();
        }
        return collection[index];
    }

    @Override
    public T[] reports() {
        T[] copy = Arrays.copyOf(collection, dim);
        Arrays.sort(copy, comparator);
        return copy;
    }

    private void resize() {
        Arrays.copyOf(collection, dim + DIM);
    }
}
