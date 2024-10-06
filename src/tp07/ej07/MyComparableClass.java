package tp07.ej07;

public class MyComparableClass implements Comparable<MyComparableClass> {
    private final String obj;
    public String sortableIdentifier;

    public MyComparableClass(String obj) {
        this.obj = obj;
    }

    @Override
    public String toString() {
        return String.format("%s - (%s)", obj, sortableIdentifier);
    }

    @Override
    public int compareTo(MyComparableClass o) {
        return sortableIdentifier.compareTo(o.sortableIdentifier);
    }
}
