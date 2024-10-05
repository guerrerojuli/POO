package tp06.ej10;

import java.util.Objects;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s # %d", name, age);
    }

    @Override
    public boolean equals(Object that) {
        return that instanceof Person thatPerson &&
                name.equals(thatPerson.name) &&
                age == thatPerson.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
