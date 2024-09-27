package taller07.ej03;

import java.util.Objects;

public class Passenger implements Comparable<Passenger> {
    private final String name;
    private final int row;
    private final PassengerCategory category;

    public Passenger(String name, int row, PassengerCategory category) {
        this.name = name;
        this.row = row;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getRow() {
        return row;
    }

    public PassengerCategory getCategory() {
        return category;
    }

    @Override
    public boolean equals(Object that) {
        return that instanceof Passenger thatP &&
                thatP.name.equals(this.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(Passenger that){
        return this.name.compareTo(that.name);
    }
}
