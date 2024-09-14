package parcial01.c12022.ej03;

public class CannotVisitAttractionException extends RuntimeException {
    public CannotVisitAttractionException(Attraction attraction) {
        super("Cannot Visit Attraction %s".formatted(attraction));
    }
}
