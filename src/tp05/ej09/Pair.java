package tp05.ej09;

public class Pair<A extends Comparable<? super A>, B extends Comparable<? super B>> implements Comparable<Pair<A, B>>{
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
        int cmp = a.compareTo(p.a);
        if (cmp != 0) return cmp;
        return b.compareTo(p.b);
    }
}