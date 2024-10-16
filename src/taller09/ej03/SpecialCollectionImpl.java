package taller09.ej03;

import java.util.*;
import java.util.function.Predicate;

public class SpecialCollectionImpl<T extends Comparable<? super T>> extends TreeSet<T> implements SpecialCollection<T> {
    private final Deque<T> undo = new LinkedList<>();

    public SpecialCollectionImpl() {
        super(Comparator.reverseOrder());
    }

    public void deleteFirst() {
        deleteFirst(t -> true);
    }

    public void deleteFirst(Predicate<? super T> condition) {
        for (T item : this) {
            if (condition.test(item)) {
                undo.add(item);
                remove(item);
                return;
            }
        }
    }

    public void undoDeleteFirst() {
        add(undo.removeLast());
    }
}
