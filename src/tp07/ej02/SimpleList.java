package tp07.ej02;

import java.util.List;
import java.util.function.BiFunction;

public interface SimpleList<T> extends List<T> {
    default <E> E reduce(E accum, BiFunction<E, T, E> reducer) {
        E ret = accum;
        for (T elem : this) {
            ret = reducer.apply(ret, elem);
        }
        return ret;
    }
}
