package taller06.ej04;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<T> implements List<T> {
    private T[] elements;
    private static final int INITIAL_DIM = 5;
    private int dim;

    public ArrayList() {
        elements = (T[]) new Object[INITIAL_DIM];
    }

    @Override
    public int contains(T element) {
        for (int i = 0; i < dim; i++) {
            if (elements[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void add(T element) {
        if (dim == elements.length) {
            resize();
        }
        elements[dim++] = element;
    }

    @Override
    public boolean isEmpty() {
        return dim == 0;
    }

    private void resize() {
        elements = Arrays.copyOf(elements, elements.length + INITIAL_DIM);
    }

    @Override
    public boolean remove(int index) {
        if (index < 0 || index >= dim) {
            throw new ArrayIndexOutOfBoundsException();
        }
        System.arraycopy(elements, index + 1, elements, index, dim - 1 - index);
        dim--;
        return true;
    }

    private class CustomIterator implements Iterator<T> {
        private int current_idx = 0;
        private final T[] iteratorElements;

        public CustomIterator(Comparator<T> compare) {
            iteratorElements = Arrays.copyOf(elements, dim);
            Arrays.sort(iteratorElements, compare);
        }

        @Override
        public boolean hasNext() {
            return current_idx < dim;
        }

        @Override
        public T next() {
            if (!hasNext()) throw new NoSuchElementException();
            return iteratorElements[current_idx++];
        }
    }

    public Iterator<T> customIterator(Comparator<T> compare) {
        return new CustomIterator(compare);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int current_idx = 0;

            @Override
            public boolean hasNext() {
                return current_idx < dim;
            }

            @Override
            public T next() {
                if (!hasNext()) throw new NoSuchElementException();
                return elements[current_idx++];
            }
        };
    }
}