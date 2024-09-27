package taller07.ej01;

import java.util.Collection;
import java.util.HashSet;
import java.util.SortedSet;

public class CitizenCollectionTester {
    public static void main(String[] args) {
        Collection<Citizen> collection = new HashSet<>();
        Citizen c1 = new Citizen(10, "Pascual", "Ordano");
        Citizen c2 = new Citizen(11, "Oscar", "Pantano");
        collection.add(c1);
        collection.add(c1);
        System.out.println(collection);
        collection.add(c2);
        collection.add(c1);
        System.out.println(collection);
    }
}
