package parcial01.c12022.ej03;

import java.time.LocalDate;

public class EndDateCityPass extends UnlimitedCityPass {
    private LocalDate endDate;

    public EndDateCityPass(Attraction[] attractions, String client, LocalDate date, LocalDate endDate) {
        super(attractions, client, date);
        this.endDate = endDate;
    }

    @Override
    public void visit(Attraction attraction, LocalDate date) {
        if (date.isAfter(endDate)) throw new CannotVisitAttractionException(attraction);
        super.visit(attraction, date);
    }
}
