package taller08.ej01;

import java.util.*;
import java.util.function.Function;

public class SimpleArrayList<T> extends ArrayList<T> implements SimpleList<T> {
    public <E> SimpleList<E> map(Function<T, E> func) {
        SimpleList<E> copy = new SimpleArrayList<>();
        this.forEach(elem -> {
            copy.add(func.apply(elem));
        });
        return copy;
    }
}
