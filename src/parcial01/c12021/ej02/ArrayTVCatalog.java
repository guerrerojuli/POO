package parcial01.c12021.ej02;

import java.security.InvalidParameterException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayTVCatalog implements TVCatalog  {
    private TVShow[] shows = new TVShow[INIT_DIM];
    private static final int INIT_DIM = 10;
    private int dim;
    private double min = 0, max = 10;

    @Override
    public TVCatalog addTVShow(String name, double rating) {
        if (dim == shows.length)    resize();
        shows[dim++] = new TVShow(name, rating);
        return this;
    }

    @Override
    public void setRatingRange(double min, double max) {
        if (!isValidRatingRange(min, max))  throw new InvalidParameterException("Invalid Parameters");
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<TVResponse> iterator() {
        return new Iterator<>() {
            private final double itMin = min, itMax = max;
            private int current;

            @Override
            public boolean hasNext() {
                return (current < dim);
            }

            @Override
            public TVResponse next() {
                if (!hasNext()) throw new NoSuchElementException();
                TVShow show = shows[current++];
                return new TVResponse(show, ((itMin <= show.getRating()) && (show.getRating() <= itMax)));
            }

        };
    }


    private void resize() {
        shows = Arrays.copyOf(shows, dim + INIT_DIM);
    }

    private boolean isValidRatingRange(double min, double max) {
        return (min <= max) && (0 <= min) && (max <= 10);
    }
}
