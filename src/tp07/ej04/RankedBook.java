package tp07.ej04;

public class RankedBook implements Comparable<RankedBook> {
    private final Book book;
    private final Genre genre;
    private int rating = 0;

    public RankedBook(Book book, Genre genre) {
        this.book = book;
        this.genre = genre;
    }

    public RankedBook(Book book) {
        this.book = book;
        this.genre = Genre.GENERAL;
    }

    public void rateUp() {
        rating++;
    }

    public Book getBook() {
        return book;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return book + " : " + rating;
    }

    @Override
    public int compareTo(RankedBook that) {
        int cmp = rating - that.rating;
        if (cmp == 0)   cmp = book.compareTo(that.book);
        return cmp;
    }
}
