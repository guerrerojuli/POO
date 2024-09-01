package taller04;

public interface List<T> {
    void add(T element);

    int indexOf(T element);

    void removeAt(int index);

    boolean isEmpty();

    default void removeElement(T element) {
        removeAt(indexOf(element));
    }
}
