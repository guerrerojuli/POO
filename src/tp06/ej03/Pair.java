package tp06.ej03;

public class Pair<E> {
    private E e1, e2;

    public Pair(E e1, E e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public String toString() {
        return String.format("# %s + %s #", e1, e2);
    }
}
