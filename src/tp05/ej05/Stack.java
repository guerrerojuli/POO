package tp05.ej05;

public interface Stack<E> {
    E peek();

    E pop();

    void push(E e);

    boolean isEmpty();
}
