package tp06.ej06;

import java.util.*;

public class PersonCollectionImpl implements PersonCollection {
    private final Map<String, Map<String, Person>> collection = new HashMap<>();

    @Override
    public void addPerson(Person aPerson) {
        collection.putIfAbsent(aPerson.getLastName(), new HashMap<>());
        collection.get(aPerson.getLastName()).put(aPerson.getFirstName(), aPerson);
    }

    @Override
    public List<Person> findByLastName(String lastName) {
        return new ArrayList<>(collection.getOrDefault(lastName, new HashMap<>()).values());
    }

    @Override
    public Person findByName(String firstName, String lastName) {
        return collection.getOrDefault(lastName, new HashMap<>()).get(firstName);
    }
}
