package tp07.ej01;

import java.util.ArrayList;
import java.util.List;

public class ArrayFilterList<T> extends ArrayList<T> implements FilterList<T> {
    @Override
    public List<T> filter(Criteria<T> criteria) {
        List<T> ret = new ArrayList<>();
        this.forEach((elem) -> {
            if (criteria.apply(elem))   ret.add(elem);
        });;
        return ret;
    }
}
