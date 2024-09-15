package parcial01.c22023.ej02;

public class AirLounge extends CapLounge {
    private final String airline;

    public AirLounge(String name, LoungeCentral central, int cap, String airline) {
        super(name, central, cap);
        this.airline = airline;
    }

    @Override
    public void enter(Passenger passenger) {
        if (!airline.equals(passenger.getAirline())) {
            throw new RuntimeException("Cannot enter lounge");
        }
        super.enter(passenger);
    }

    @Override
    public String toString() {
        return airline+ " " + super.toString();
    }
}
