package parcial01.c22023.ej02;

public class Lounge {
    private final String name;
    private int guests;
    private final LoungeCentral central;

    public Lounge(String name, LoungeCentral central) {
        this.name = name;
        this.central = central;
    }

    public void enter(Passenger passenger) {
        if (!central.isOpen() || !passenger.hasPass()) {
            throw new RuntimeException("Cannot enter lounge");
        }
        passenger.usePass();
        guests++;
    }

    public void exit() {
        exit(1);
    }

    public void exit(int number) {
        if (guests - number < 0) {
            throw new RuntimeException("Lounge is empty");
        }
        guests -= number;
    }

    public int getGuests() {
        return guests;
    }

    @Override
    public String toString() {
        return "%s has %d guests".formatted(name, guests);
    }
}
