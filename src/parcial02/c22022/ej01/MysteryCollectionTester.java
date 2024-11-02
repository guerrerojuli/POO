package parcial02.c22022.ej01;

public class MysteryCollectionTester {
    public static void main(String[] args) {
        MysteryCollection<Integer> mc1 = new MysteryCollectionImpl<>();
        mc1.add(33); mc1.add(11); mc1.add(99); mc1.add(22); mc1.add(33);
        System.out.println(mc1.size()); // 4
        System.out.println(mc1.contains(33)); // true
        for(int element : mc1) {
            System.out.println(element); // 99 \n 33 \n 22 \n 11
        }
        // Obtiene el primer elemento de la colección
        System.out.println(mc1.getFirst()); // 99
        // Obtiene el último elemento de la colección
        System.out.println(mc1.getLast()); // 11


        MysteryCollection<String> mc2 = new MysteryCollectionImpl<>();
        mc2.add("Hello"); mc2.add("World"); mc2.add("World"); mc2.add("Mundo");
        System.out.println(mc2.size()); // 3
        for(String element : mc2) {
            System.out.println(element); // World \n Mundo \n Hello
        }


        // zip retorna una nueva colección donde el i-ésimo elemento de mc1
        // se asocia con el i-ésimo elemento de mc2 usando la clase Pair
        Iterable<Pair<Integer, String>> mc1mc2 = mc1.zip(mc2);
        mc1.add(50);
        for(Pair<Integer, String> element : mc1mc2) {
            System.out.println(element);
        }
        /**
         * { 99 <> World }
         * { 33 <> Mundo }
         * { 22 <> Hello }
         */


        MysteryCollection<SimpleElement> mc3 = new MysteryCollectionImpl<>();
        mc3.add(new SimpleElement(15, "Foo"));
        mc3.add(new SimpleElement(30, "Bar"));
        Iterable<Pair<SimpleElement, Integer>> mc3mc1 = mc3.zip(mc1);
        for(Pair<SimpleElement, Integer> element : mc3mc1) {
            System.out.println(element);
        }
        /**
         * { Element 30 :: Bar <> 99 }
         * { Element 15 :: Foo <> 50 }
         */


        System.out.println(new MysteryCollectionImpl<>().zip(mc1).isEmpty()); // true
        System.out.println(mc1.zip(new MysteryCollectionImpl<Float>()).isEmpty()); // true
    }


    static abstract class Element implements Comparable<Element> {
        private final int id;
        private final String content;
        public Element(int id, String content) {
            this.id = id;
            this.content = content;
        }
        @Override
        public int compareTo(Element o) {
            return Integer.compare(id, o.id);
        }
        @Override
        public String toString() {
            return String.format("Element %d :: %s", id, content);
        }
    }
    static class SimpleElement extends Element {
        public SimpleElement(int id, String content) {
            super(id, content);
        }
    }


}
