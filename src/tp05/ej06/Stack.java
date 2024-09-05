package tp05.ej06;

public interface Stack<E> {
    E peek();

    E pop();

    void push(E e);

    boolean isEmpty();
}
