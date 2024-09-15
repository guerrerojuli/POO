package parcial01.c22023.ej01;

import java.time.LocalTime;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ParkRide implements Iterable<ParkSlot> {
    private final String name;
    private final LocalTime open;
    private LocalTime close;
    private final long slotLength;

    public ParkRide(String name, LocalTime open, LocalTime close, long slotLength) {
        if (slotLength <= 0) {
            throw new RuntimeException("Slot minutes must be positive");
        }
        this.name = name;
        this.open = open;
        this.slotLength = slotLength;
        setCloseTime(close);
    }

    public Iterator<ParkSlot> iterator() {
        return new Iterator<>() {
            private LocalTime current = open;
            private final LocalTime itClose = close;

            @Override
            public boolean hasNext() {
                return current.isBefore(itClose);
            }

            @Override
            public ParkSlot next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                ParkSlot slot = new ParkSlot(name, current);
                current = current.plusMinutes(slotLength);
                return slot;
            }
        };
    }

    public void setCloseTime(LocalTime time) {
        if (open.isAfter(time)) {
            throw new RuntimeException("Close time cannot be before open time");
        }
        close = time;
    }
}
