package parcial01.c22023.ej02;

public class Passenger {
    private final String name;
    private final String airline;
    private int passes;

    public Passenger(String name, String airline, int passes) {
        this.name = name;
        this.airline = airline;
        this.passes = passes;
    }

    public boolean hasPass() {
        return passes > 0;
    }

    public void usePass() {
        passes--;
    }

    public String getAirline() {
        return airline;
    }
}
