package parcial01.c12021.ej02;

public interface TVCatalog extends Iterable<TVResponse> {

    TVCatalog addTVShow(String name, double rating);

    void setRatingRange(double min, double max);

}
