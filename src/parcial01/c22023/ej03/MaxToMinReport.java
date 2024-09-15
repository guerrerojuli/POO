package parcial01.c22023.ej03;

import java.util.Comparator;

public class MaxToMinReport<T> extends ReportCollectionImpl<T> {
    public MaxToMinReport(Comparator<? super T> comparator) {
        super(comparator.reversed());
    }
}
