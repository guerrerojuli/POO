package tp07.ej01;

import java.util.ArrayList;
import java.util.List;

public interface FilterList<T> extends List<T> {
    List<T> filter(Criteria<T> criteria);
}