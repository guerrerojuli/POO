package tp05.ej06;

import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack<E> implements Stack<E> {
    private E[] elements;
    private static final int INITIAL_DIM = 10;
    private int elemCount;

    public ArrayStack() {
        //elements = new E[INITIAL_DIM]; no es posible instanciar un arreglo generico
        elements = (E[]) new Object[INITIAL_DIM];
        elemCount = 0;
    }

    @Override
    public E peek() {
        if (isEmpty()) return null;
        return elements[elemCount-1];
    }

    @Override
    public void push(E e) {
        if (elemCount == elements.length) {
            elements = Arrays.copyOf(elements, elemCount + INITIAL_DIM);
        }
        elements[elemCount++] = e;
    }

    @Override
    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        return elements[--elemCount];
    }

    @Override
    public boolean isEmpty() {
        return elemCount == 0;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = elemCount-1; i >= 0; i--) {
            str.append(elements[i]);
            if (i != 0) str.append(",");
        }
        str.append("]");
        return str.toString();
    }
}
