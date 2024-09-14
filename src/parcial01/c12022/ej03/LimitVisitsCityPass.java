package parcial01.c12022.ej03;


import java.time.LocalDate;

public class LimitVisitsCityPass extends UnlimitedCityPass {
    private int limit;

    public LimitVisitsCityPass(Attraction[] attractions, String client, LocalDate date, int limit) {
        super(attractions, client, date);
        this.limit = limit;
    }

    @Override
    public void visit(Attraction attraction, LocalDate date) {
        if (limit == 0) throw new CannotVisitAttractionException(attraction);
        super.visit(attraction, date);
        limit--;
    }
}
