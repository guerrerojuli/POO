package parcial01.c12023.ej02;

import java.time.LocalDate;

public class Movie extends VideoCatalogElement {
    private final String studio;

    public Movie(String title, LocalDate airedDate, String studio) {
        super(title, airedDate);
        this.studio = studio;
    }

    @Override
    public String toString() {
        return super.toString() + " is a Movie from Studio %s".formatted(studio);
    }
}
