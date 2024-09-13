package taller05.ej01;

public class FerryCompany {
    private final String name;

    public FerryCompany(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof FerryCompany c && c.name.equals(name);
    }
}
