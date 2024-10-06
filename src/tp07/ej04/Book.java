package tp07.ej04;

import java.util.Objects;

public class Book implements Comparable<Book> {
    private final String title, author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return title;
    }

    @Override
    public int compareTo(Book that) {
        int cmp = title.compareTo(that.title);
        if (cmp == 0)   author.compareTo(that.author);
        return cmp;
    }

    @Override
    public boolean equals(Object that) {
        return that instanceof Book thatBook &&
                title.equals(thatBook.title) &&
                author.equals(thatBook.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}
