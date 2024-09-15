package parcial01.c22023.ej03;

import java.util.Comparator;

public class MinToMaxReport<T> extends ReportCollectionImpl<T> {
    public MinToMaxReport(Comparator<? super T> comparator) {
        super(comparator);
    }
}
