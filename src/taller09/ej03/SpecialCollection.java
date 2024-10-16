package taller09.ej03;

import java.util.Collection;
import java.util.function.Predicate;

public interface SpecialCollection<T> extends Collection<T> {
    void deleteFirst();

    void deleteFirst(Predicate<? super T> condition);

    void undoDeleteFirst();
}
