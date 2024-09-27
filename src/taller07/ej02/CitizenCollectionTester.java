package taller07.ej02;

import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class CitizenCollectionTester {
    public static void main(String[] args) {
        //Collection<Citizen> collection = new TreeSet<>();
        Collection<Citizen> collection = new TreeSet<>(Comparator.reverseOrder());
        Citizen c1 = new Citizen(10, "Pascual", "Ordano");
        Citizen c2 = new Citizen(11, "Oscar", "Pantano");
        Citizen c3 = new Citizen(10, "Molo", "Lendez");
        Citizen c4 = new Citizen(9, "Molo", "Lendez");
        collection.add(c1);
        collection.add(c4);
        collection.add(c1);
        System.out.println(collection);
        collection.add(c2);
        collection.add(c1);
        collection.add(c3);
        System.out.println(collection);
    }
}
