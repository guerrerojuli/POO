package taller08.ej01;

import java.util.List;
import java.util.function.Function;

public interface SimpleList<T> extends List<T> {
    <E> SimpleList<E> map(Function<T, E> func);
}
