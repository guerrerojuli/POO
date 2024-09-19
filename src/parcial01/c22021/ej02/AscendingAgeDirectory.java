package parcial01.c22021.ej02;

public class AscendingAgeDirectory extends SortedDirectory {
    public AscendingAgeDirectory(int limit) {
        super(limit, (p1, p2) -> {
            int cmp = p1.getAge() - p2.getAge();
            if (cmp == 0)   cmp = p1.getName().compareTo(p2.getName());
            return cmp;
        });
    }
}
