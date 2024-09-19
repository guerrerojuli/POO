package parcial01.c22021.ej02;

public class DescendingNameDirectory extends SortedDirectory {
    public DescendingNameDirectory(int limit) {
        super(limit, (p1, p2) -> {
            int cmp = p2.getName().compareTo(p1.getName());
            if (cmp == 0)   cmp = p1.getAge() - p2.getAge();
            return cmp;
        });
    }
}
