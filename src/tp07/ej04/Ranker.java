package tp07.ej04;

import java.util.*;

public class Ranker {
    Set<RankedBook> ranker = new TreeSet<>();

    public Ranker add(Genre genre, Book book) {
        ranker.add(new RankedBook(book, genre));
        return this;
    }

    public void rateUp(Book book) {
        for (RankedBook rankedBook : ranker) {
            if (book.equals(rankedBook.getBook())) {
                rankedBook.rateUp();
                return;
            }
        }
        RankedBook toAdd = new RankedBook(book);
        toAdd.rateUp();
        ranker.add(toAdd);
    }

    public void printRanking(Genre genre) {
        System.out.println("Ranking of " + genre);
        for (RankedBook rankedBook : ranker) {
            if (rankedBook.getGenre().equals(genre)) {
                System.out.println(rankedBook);
            }
        }
    }

    public void printRanking() {
        System.out.println("Ranking of " + Genre.GENERAL);
        for (RankedBook rankedBook : ranker) {
            System.out.println(rankedBook);
        }
    }
}
