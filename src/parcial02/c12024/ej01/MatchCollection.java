package parcial02.c12024.ej01;

import java.util.*;
import java.util.function.*;

public interface MatchCollection<T extends Comparable<? super T>> extends List<T> {
    void addMatchPredicate(Predicate<T> p);

    SequencedSet<T> getAllMatched();

    default SequencedSet<T> getAllMatchedReversed() {
        return getAllMatched().reversed();
    }
}
