package tp05.ej06;

public class ArrayAccessStack<E> extends ArrayStack<E> implements AccessStack<E> {
    private int pushAccesses;
    private int popAccesses;

    public ArrayAccessStack() {
        pushAccesses = popAccesses = 0;
    }

    @Override
    public void push(E e) {
        super.push(e);
        pushAccesses++;
    }

    @Override
    public E pop() {
        E ret = super.pop();
        popAccesses++;
        return ret;
    }

    public int getPushAccesses() {
        return pushAccesses;
    }

    public int getPopAccesses() {
        return popAccesses;
    }
}
