package parcial02.c12024.ej01;

import java.util.*;
import java.util.function.Predicate;

public class MatchCollectionImpl<T extends Comparable<? super T>> extends ArrayList<T> implements MatchCollection<T> {
    private Predicate<T> predicate = (e) -> true;

    @Override
    public void addMatchPredicate(Predicate<T> p) {
        predicate = predicate.and(p);
    }

    @Override
    public SequencedSet<T> getAllMatched() {
        TreeSet<T> matches = new TreeSet<>();
        for (T match : this) {
            if (predicate.test(match)) {
                matches.add(match);
            }
        }
        return matches;
    }
}
