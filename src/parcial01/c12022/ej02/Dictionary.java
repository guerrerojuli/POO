package parcial01.c12022.ej02;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class Dictionary<T extends Comparable<? super T>> {
    private DictionaryEntry<T>[] dictionary;
    private int dim;
    private static final int DIM = 10;

    public Dictionary() {
        dictionary = new DictionaryEntry[DIM];
        dim = 0;
    }

    public Dictionary<T> addEntry(T word, String def) {
        DictionaryEntry<T> entry = new DictionaryEntry<>(word, def);
        if (dim == dictionary.length) resize();
        dictionary[dim++] = entry;
        return this;
    }

    private DictionaryEntry<T>[] getSortedCopy(Comparator<DictionaryEntry<T>> comparator) {
        DictionaryEntry<T>[] copy = Arrays.copyOf(dictionary, dim);
        Arrays.sort(copy, comparator);
        return copy;
    }

    public DictionaryEntry<T>[] getNaturalOrderCopy() {
        return getSortedCopy(Comparator.naturalOrder());
    }

    public DictionaryEntry<T>[] getReverseOrderCopy() {
        return getSortedCopy(Comparator.reverseOrder());
    }

    public DictionaryEntry<T> getFirstMatch(Predicate<T> condition) {
        for (int i = 0; i < dim; i++) {
            DictionaryEntry<T> entry = dictionary[i];
            if (condition.test(entry.getWord())) return entry;
        }
        throw new IllegalArgumentException();
    }

    private void resize() {
        dictionary = Arrays.copyOf(dictionary, dim + DIM);
    }

}
