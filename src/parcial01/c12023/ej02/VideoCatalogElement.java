package parcial01.c12023.ej02;

import java.time.LocalDate;

public abstract class VideoCatalogElement implements Comparable<VideoCatalogElement> {
    private final String title;
    private final LocalDate airedDate;

    public VideoCatalogElement(String title, LocalDate airedDate) {
        this.title = title;
        this.airedDate = airedDate;
    }

    @Override
    public int compareTo(VideoCatalogElement o) {
        int cmp = airedDate.compareTo(o.airedDate); // Creciente por fecha
        if (cmp == 0) cmp = o.title.compareTo(title); // Alfabeticamente (descendiente) por titulo
        return cmp;
    }

    @Override
    public String toString() {
        return "%s aired on %s".formatted(title, airedDate);
    }
}
