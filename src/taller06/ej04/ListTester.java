package taller06.ej04;

import java.util.Iterator;

public class ListTester {
    public static void main(String[] args) {
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(4);
        integerList.add(3);
        integerList.add(5);
        // OpciÃ³n 1: Iterador convencional (orden de inserciÃ³n)
        for(Integer element : integerList) {
            System.out.println(element);
        }
        // OpciÃ³n 2: CustomIterator (descendente)
        Iterator<Integer> iterator = integerList.customIterator((o1, o2) -> o2.compareTo(o1));
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // FallarÃ¡
        iterator.next();
    }
}