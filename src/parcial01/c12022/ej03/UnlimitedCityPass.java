package parcial01.c12022.ej03;

import java.time.LocalDate;
import java.util.Arrays;

public class UnlimitedCityPass implements CityPass {
    private Attraction[] attractions;
    private String client;
    private LocalDate emission;
    private int visits;

    public UnlimitedCityPass(Attraction[] attractions, String client, LocalDate date) {
        this.attractions = Arrays.copyOf(attractions, attractions.length);
        this.client = client;
        this.emission = date;
        this.visits = 0;
    }

    @Override
    public void visit(Attraction attraction, LocalDate date) {
        if (!belongsIn(attraction) || date.isBefore(emission)) {
            throw new CannotVisitAttractionException(attraction);
        }
        visits++;
        System.out.println("%s visited %s".formatted(client, attraction));
    }

    @Override
    public Attraction[] getAttractions() {
        return Arrays.copyOf(attractions, attractions.length);
    }

    @Override
    public String toString() {
        return "CityPass for %s used for %d attractions".formatted(client, visits);
    }
}
