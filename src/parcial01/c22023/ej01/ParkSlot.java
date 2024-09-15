package parcial01.c22023.ej01;

import java.time.LocalTime;

public class ParkSlot {
    private final String rideName;
    private final LocalTime time;

    public ParkSlot(String rideName, LocalTime time) {
        this.rideName = rideName;
        this.time = time;
    }

    @Override
    public String toString() {
        return "%s <> %s Slot".formatted(rideName, time);
    }
}
