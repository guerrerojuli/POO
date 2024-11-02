package parcial02.c12022.ej01;

import java.util.*;
import java.util.function.*;

public interface MysteryCollection<T> extends List<T> {
    default Map<T, Integer> toBag(Predicate<T> predicate) {
        Map<T, Integer> bag = new HashMap<>();
        for (T element : this) {
            if (predicate.test(element)) {
                bag.put(element, bag.getOrDefault(element, 0) + 1);
            }
        }
        return bag;
    }

    default Map<T, Integer> toBag() {
        return toBag(_ -> true);
    }
}