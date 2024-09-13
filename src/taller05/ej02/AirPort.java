package taller05.ej02;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class AirPort {
    private Counter[] counters;
    private int nCounter;
    private static final int INITIAL_DIM = 10;

    public AirPort() {
        counters = new Counter[INITIAL_DIM];
        nCounter = 0;
    }

    public Counter addCounter(String name) {
        if (nCounter == counters.length) {
            resize();
        }
        Counter counter = new Counter(name, nCounter);
        counters[nCounter++] = counter;
        return counter;
    }

    public void counterCheckIn(Predicate<Counter> criteria) {
        for (Counter counter : counters) {
            if (criteria.test(counter)) {
                counter.checkIn();
                return;
            }
        }
    }

    public Counter[] airlineDescendingOrderCounters(){
        Counter[] copy = Arrays.copyOf(counters, nCounter);
        Arrays.sort(copy, Comparator.reverseOrder());
        return copy;
    }

    public Counter[] airlineOrderCounters(){
        Counter[] copy = Arrays.copyOf(counters, nCounter);
        Arrays.sort(copy, Comparator.naturalOrder());
        return copy;
    }

    private void resize() {
        counters = Arrays.copyOf(counters, nCounter + INITIAL_DIM);
    }


}
