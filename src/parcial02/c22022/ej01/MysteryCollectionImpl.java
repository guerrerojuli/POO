package parcial02.c22022.ej01;

import java.util.*;

public class MysteryCollectionImpl<T extends Comparable<? super T>> extends TreeSet<T> implements MysteryCollection<T> {
    public MysteryCollectionImpl() {
        super(Comparator.reverseOrder());
    }
}
