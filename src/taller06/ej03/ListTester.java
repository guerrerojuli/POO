package taller06.ej03;

import java.util.Iterator;

public class ListTester {
    static class IntegerWrapper implements Comparable<IntegerWrapper> {
        int value;
        public IntegerWrapper(int value) {
            this.value = value;
        }
        @Override
        public String toString() {
            return "IntegerWrapper{" +
                    "value=" + value +
                    '}';
        }
        @Override
        public int compareTo(IntegerWrapper o) {
            return Integer.compare(value,o.value);
        }
    }

    static class SpecialIntegerWrapper extends IntegerWrapper {
        public SpecialIntegerWrapper(int value) {
            super(value);
        }
        @Override
        public String toString() {
            return "SpecialIntegerWrapper{" +
                    "value=" + value +
                    '}';
        }
    }

    /*
    public static void main(String[] args) {
        List<SpecialIntegerWrapper> integerList = new ArrayList<>();
        integerList.add(new SpecialIntegerWrapper(1));
        integerList.add(new SpecialIntegerWrapper(4));
        integerList.add(new SpecialIntegerWrapper(3));
        integerList.add(new SpecialIntegerWrapper(5));
        // Opcion 1: Usando la sentencia forEach
        for(IntegerWrapper element : integerList) {
            System.out.println(element);
        }
        // Opcion 2: Usando el iterador
        Iterator<SpecialIntegerWrapper> iterator = integerList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Fallara
        iterator.next();
    }
    */

}