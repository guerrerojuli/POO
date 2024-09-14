package parcial01.c12022.ej03;

public class Attraction {
    private String name;

    public Attraction(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object that) {
        return that instanceof Attraction thatAttraction && this.name.equals(thatAttraction.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
