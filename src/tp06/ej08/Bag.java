package tp06.ej08;

public interface Bag<T> {
    void add(T item);

    int count(T item);

    int size();

    int sizeDistinct();

    boolean contains(T item);

    void remove(T item);
}
