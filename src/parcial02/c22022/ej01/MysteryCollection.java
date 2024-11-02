package parcial02.c22022.ej01;

import java.util.*;

public interface MysteryCollection<T extends Comparable<? super T>> extends SequencedSet<T> {

    default <E extends Comparable<? super E>> List<Pair<T, E>> zip(MysteryCollection<E> mc) {
        List<Pair<T, E>> toReturn = new ArrayList<>();
        Iterator<T> it1 = this.iterator();
        Iterator<E> it2 = mc.iterator();
        while (it1.hasNext() && it2.hasNext()) {
           toReturn.add(new Pair<>(it1.next(), it2.next()));
        }
        return toReturn;
    }

}
