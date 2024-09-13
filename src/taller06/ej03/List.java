package taller06.ej03;

public interface List<E extends Comparable<? super E>> extends Iterable<E> {
    boolean isEmpty();

    int contains(E element);

    void add(E element);

    boolean remove(int index);

    default boolean removeElement(E element) {
        int index = contains(element);
        if(index != -1) {
            return remove(index);
        }
        return false;
    }

}