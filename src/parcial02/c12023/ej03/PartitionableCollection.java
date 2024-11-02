package parcial02.c12023.ej03;

import java.util.*;
import java.util.function.*;

public class PartitionableCollection<T> extends ArrayList<T> {
    public PartitionableCollection<T> getSelected(Predicate<T> predicate) {
        PartitionableCollection<T> result = new PartitionableCollection<T>();
        for (T elem : this) {
            if (predicate.test(elem)) {
                result.add(elem);
            }
        }
        return result;
    }

    public PartitionableCollection<T> getRejected(Predicate<T> predicate) {
        return getSelected(predicate.negate());
    }
}
