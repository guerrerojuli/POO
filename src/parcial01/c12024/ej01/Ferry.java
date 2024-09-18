package parcial01.c12024.ej01;

public class Ferry {
    private final String name;
    private final FerryCompany company;
    public Ferry(String name, FerryCompany c) {
        this.name = name;
        this.company = c;
    }
    public FerryCompany getCompany() {
        return company;
    }
    @Override
    public String toString() {
        return "Ferry %s".formatted(name);
    }
    @Override
    public boolean equals(Object o) {
        return o instanceof Ferry that && name.equals(that.name) && company.equals(that.company);
    }
}
