package tp05.ej03.parte01;

public class LinearListImpl<T> implements LinearList<T> {
    private Node first;
    private Node last;
    private int size;

    public LinearListImpl() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    private Node searchNode(int i) {
        if (i >= size || i < 0) throw new IndexOutOfBoundsException();
        Node current = first;
        for (int j = 0; j < i; j++) {
            current = current.getNext();
        }
        return current;
    }

    @Override
    public void add(T obj) {
        Node newLast = new Node(obj, null);
        if (size == 0) {
            first = newLast;
        } else {
            last.setNext(newLast);
        }
        last = newLast;
        size++;
    }

    @Override
    public T get(int i) {
        Node node = searchNode(i);
        return (T) node.getValue();
    }

    @Override
    public void set(int i, T obj) {
        Node node = searchNode(i);
        node.setValue(obj);
    }

    @Override
    public void remove(int i) {
        if (i >= size || i < 0) throw new IndexOutOfBoundsException();
        if (i == 0) {
            first = first.getNext();
        } else {
            Node node = searchNode(i-1);
            Node toRemove = node.getNext();
            node.setNext(toRemove.getNext());
        }
        size--;
    }

    @Override
    public int indexOf(T obj) {
        Node current = first;
        for (int i = 0; i < size; i++) {
            if (current.getValue().equals(obj)) return i;
            current = current.getNext();
        }
        return -1;
    }

    @Override
    public int size() {
        return size;
    }
}
