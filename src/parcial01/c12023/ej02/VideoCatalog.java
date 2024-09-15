package parcial01.c12023.ej02;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class VideoCatalog {
    private VideoCatalogElement[] catalogElements;
    private int dim;
    private static final int DIM = 10;

    public VideoCatalog() {
        catalogElements = new VideoCatalogElement[DIM];
    }

    // Add episode
    public VideoCatalog add(String title, LocalDate date, int season) {
        if (catalogElements.length == dim)  resize();
        catalogElements[dim++] = new TVEpisode(title, date, season);
        return this;
    }

    // Add movie
    public VideoCatalog add(String title, LocalDate date, String studio) {
        if (catalogElements.length == dim)  resize();
        catalogElements[dim++] = new Movie(title, date, studio);
        return this;
    }

    private VideoCatalogElement[] getSortedCopy(Comparator<VideoCatalogElement> compare) {
        VideoCatalogElement[] copy = Arrays.copyOf(catalogElements, dim);
        Arrays.sort(copy, compare);
        return copy;
    }

    public VideoCatalogElement[] getDescendingDateCopy() {
        return getSortedCopy(Comparator.reverseOrder());
    }

    public VideoCatalogElement[] getChronologicalDateCopy() {
        return getSortedCopy(Comparator.naturalOrder());
    }

    private void resize() {
        catalogElements = Arrays.copyOf(catalogElements, dim + DIM);
    }
}
