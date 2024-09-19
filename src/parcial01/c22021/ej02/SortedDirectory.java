package parcial01.c22021.ej02;

import java.util.Comparator;
import java.util.Arrays;

public abstract class SortedDirectory {
    private Comparator<Person> comparator;
    private Person[] persons;
    private int dim;

    public SortedDirectory(int limit, Comparator<Person> comparator) {
        persons = new Person[limit];
        this.comparator = comparator;
    }

    public SortedDirectory addPerson(Person person) {
        if (dim == persons.length)  throw new ReachedLimitException(persons.length);
        persons[dim++] = person;
        return this;
    }

    public Person[] persons() {
       Person[] toReturn = Arrays.copyOf(persons, dim);
       Arrays.sort(toReturn, comparator);
       return toReturn;
    }
}
