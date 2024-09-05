package tp05.ej10;

public class Pair<A extends Comparable<A>, B extends Comparable<B>> implements Comparable<Pair<A, B>>{
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

    @Override
    public int compareTo(Pair<A, B> p) {
        int cmp = p.a.compareTo(a);
        if (cmp != 0) return cmp;
        return p.b.compareTo(b);
    }
}