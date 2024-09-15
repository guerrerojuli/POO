package parcial01.c22023.ej02;

public class CapLounge extends Lounge {
    private final int cap;

    public CapLounge(String name, LoungeCentral central, int cap) {
        super(name, central);
        this.cap = cap;
    }

    @Override
    public void enter(Passenger passenger) {
        if (cap <= getGuests()) {
            throw new RuntimeException("Cannot enter lounge");
        }
        super.enter(passenger);
    }

    @Override
    public String toString() {
        return super.toString() + " up to %d guests".formatted(cap);
    }
}
