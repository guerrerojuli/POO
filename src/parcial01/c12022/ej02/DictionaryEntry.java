package parcial01.c12022.ej02;

public class DictionaryEntry<T extends Comparable<? super T>> implements Comparable<DictionaryEntry<T>> {
    private final T word;
    private final String def;

    public DictionaryEntry(T word, String def) {
        this.word = word;
        this.def = def;
    }

    public T getWord() {
        return word;
    }

    public String getDef() {
        return def;
    }

    @Override
    public int compareTo(DictionaryEntry<T> o) {
        int cmp = word.compareTo(o.word);
        if (cmp == 0) cmp = def.compareTo(o.def);
        return cmp;
    }

    @Override
    public String toString() {
        return "{ %s <> %s }".formatted(word, def);
    }
}
