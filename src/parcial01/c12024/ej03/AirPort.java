package parcial01.c12024.ej03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class AirPort {
    private Counter[] counters;
    private final int DIM = 10;
    private int dim;

    public AirPort() {
        counters = new Counter[DIM];
    }

    public Counter addCounter(String name) {
        if (dim == counters.length) resize();
        Counter counter = new Counter(name , dim);
        counters[dim++] = counter;
        return counter;
    }

    private Counter[] getSortedCopy(Comparator<Counter> comparator) {
        Counter[] copy = Arrays.copyOf(counters, dim);
        Arrays.sort(copy, comparator);
        return copy;
    }

    public void counterCheckIn(Predicate<Counter> condition) {
        for (int i = 0; i < dim; i++) {
            if (condition.test(counters[i])) {
                counters[i].checkIn();
                return;
            }
        }
    }

    public Counter[] airlineOrderCounters() {
        return getSortedCopy(Comparator.naturalOrder());
    }

    public Counter[] airlineDescendingOrderCounters() {
        return getSortedCopy(Comparator.reverseOrder());
    }

    private void resize() {
        counters = Arrays.copyOf(counters, dim + DIM);
    }
}
