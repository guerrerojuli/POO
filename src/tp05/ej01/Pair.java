package tp05.ej01;

public class Pair<A, B> {
    private A a;
    private B b;

    public Pair(A a, B b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "[" + a + ", " + b + "]";
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Pair<?, ?> p && p.a.equals(a) && p.b.equals(b);
    }
}