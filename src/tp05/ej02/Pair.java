package tp05.ej02;

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

    public void set(A a) {
      this.a = a;
    }

    /*
    Error de compulacion pues ambos metodos tienen la misma firma
    public void set(B b) {
      this.b = b;
    }
    */
}
