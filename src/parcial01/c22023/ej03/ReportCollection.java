package parcial01.c22023.ej03;

public interface ReportCollection<R> {
    void add(R report);

    R get(int index);

    R[] reports();
}
