package taller08.ej01;

public class SimpleListTester {
    public static void main(String[] args) {
        SimpleList<Integer> l1 = new
                SimpleArrayList<>();

        l1.add(1); l1.add(3);
        l1.add(5); l1.add(7);

        System.out.println(l1.size());
        System.out.println(l1.contains(0));

        SimpleList<Integer> l2 =
                l1.map(e -> e * 2);

        for(Integer e : l2) {
            System.out.println(e);
        }

        SimpleList<String> l3 = l2.map(
                e -> String.format("<%d>", e));

        for(String e : l3) {
            System.out.println(e);
        }
    }
}
