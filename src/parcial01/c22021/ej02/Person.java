package parcial01.c22021.ej02;

public class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person Name=%s, Age=%d".formatted(name, age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
