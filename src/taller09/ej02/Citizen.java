package taller09.ej02;

public class Citizen {
    private final int dni;
    private final String name, lastname;

    public Citizen(int dni, String name, String lastname) {
        this.dni = dni;
        this.name = name;
        this.lastname = lastname;
    }

    public String getLastName() {
        return lastname;
    }

    public String getName() {
        return name;
    }
}
