package parcial01.c22021.ej02;

public class Directory extends SortedDirectory {
    public Directory(int limit) {
        super(limit, (p1, p2) -> {
            int cmp = p1.getName().compareTo(p2.getName());
            if (cmp == 0)   cmp = p2.getAge() - p1.getAge();
            return cmp;
        });
    }
}
