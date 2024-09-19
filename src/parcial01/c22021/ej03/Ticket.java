package parcial01.c22021.ej03;

public class Ticket {
    private static int ID = 1000;
    private final int id;
    private final boolean forSki;
    private int rides;

    public Ticket(boolean forSki, int rides) {
        id = ++ID;
        this.forSki = forSki;
        this.rides = rides;
    }

    public void useRide() {
        if (rides == 0) throw new RuntimeException("No more rides for ticket");
        rides--;
    }

    public boolean isForSki() {
        return forSki;
    }

    @Override
    public String toString() {
        return "%s Ticket %d has %d rides left".formatted((forSki) ? "Ski" : "Visitor", id, rides);
    }
}
