package taller07.ej03;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

public abstract class BoardingFlight {
    SortedSet<Passenger> collection;

    public BoardingFlight(SortedSet<Passenger> collection) {
        this.collection = collection;
    }

    public void addForBoarding(String name, int row, PassengerCategory category) {
        collection.add(new Passenger(name, row, category));
    }

    public Iterator<String> boardingCallIterator() {
        return new Iterator<>() {
            private final Iterator<Passenger> it = collection.iterator();

            @Override
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override
            public String next(){
                if (!hasNext()) throw new NoSuchElementException();
                return it.next().getName();
            }
        };
    }
}
