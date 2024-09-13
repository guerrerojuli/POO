package parcial01.c12022.ej01;

import java.util.Iterator;

public class MilesClient implements Iterable<String> {
    private final MilesPlan plan;
    private final String name;
    private final int months;

    public MilesClient(String name, int months, MilesPlan plan) {
        this.plan = plan;
        this.name = name;
        this.months = months;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {
            private int current = 1;

            @Override
            public boolean hasNext() {
                return current <= months;
            }

            @Override
            public String next() {
                return "Client %s: Month %d earned %d miles for $%g".formatted(
                        name,
                        current,
                        plan.getMiles(current++),
                        plan.getCost()
                );
            }
        };
    }
}
