package taller06.ej02;

import java.util.Iterator;

public class ListTester {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>((o1, o2) -> o2.compareTo(o1));
        integerList.add(1);
        integerList.add(4);
        integerList.add(3);
        integerList.add(5);
        // Opcion 1: Usando la sentencia forEach
        for(Integer element : integerList) {
            System.out.println(element);
        }
        // Opcion 2: Usando el iterador
        Iterator<Integer> iterator = integerList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // Fallara
        iterator.next();
    }

}