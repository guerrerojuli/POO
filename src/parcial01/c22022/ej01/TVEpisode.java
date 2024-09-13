package parcial01.c22022.ej01;

import java.time.LocalDate;

public class TVEpisode implements Comparable<TVEpisode> {
    private final int id;
    private final String title;
    private final double rating;
    private final LocalDate airedDate;

    public TVEpisode(int id, String title, double rating, LocalDate airedDate) {
        this.id = id;
        this.title = title;
        this.rating = rating;
        this.airedDate = airedDate;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Double getRating() {
        return rating;
    }

    public LocalDate getAiredDate() {
        return airedDate;
    }

    @Override
    public String toString() {
        return "(%d) Episode %s on %s has %g rating".formatted(id, title, airedDate, rating);
    }

    @Override
    public int compareTo(TVEpisode e) {
        return this.getId() - e.getId();
    }
}
