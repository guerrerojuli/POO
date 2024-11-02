package parcial02.c12023.ej02;

public class AddressBookGroup implements Comparable<AddressBookGroup> {
    private final String name;

    public AddressBookGroup(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(AddressBookGroup o) {
        return this.name.compareTo(o.name);
    }
}
