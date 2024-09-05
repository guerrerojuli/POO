package tp05.ej04;

public class PrependLinearListImpl<T> implements LinearList<T> {
    //private Node<T> first;
    private Node first;

    @Override
    public void add(T obj) {
        //first = new Node<>(obj);
        first = new Node(obj);
    }

    @Override
    public T get(int i) {
        return null;
    }

    @Override
    public void set(int i, T obj) {

    }

    @Override
    public void remove(int i) {

    }

    @Override
    public int indexOf(T obj) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

//    private class Node<T> {
    /* al definir Node<T> T sobreescribe al de la clase principal */
    private class Node {

        private T head;
        //private Node<T> tail;
        private Node tail;

        Node(T head) {
            this.head = head;
            this.tail = first;
            first = this;
        }

    }

}


