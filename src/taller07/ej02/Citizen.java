package taller07.ej02;

import java.util.Objects;

public class Citizen implements Comparable<Citizen> {
    private final int dni;
    private final String name;
    private final String lastname;

    public Citizen(int dni, String name, String lastname){
        this.dni = dni;
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object that) {
        return that instanceof Citizen thatCit &&
                dni == thatCit.dni;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return String.format("%d: %s %s", dni, name, lastname);
    }

    @Override
    public int compareTo(Citizen c) {
        return dni - c.dni;
    }
}
