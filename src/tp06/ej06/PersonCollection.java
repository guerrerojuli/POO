package tp06.ej06;

import java.util.List;

public interface PersonCollection {
    void addPerson(Person aPerson);

    List<Person> findByLastName(String lastName);

    Person findByName(String firstName, String lastName);
}
