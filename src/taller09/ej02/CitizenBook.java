package taller09.ej02;

import java.util.*;

public class CitizenBook {
    private final Map<String, Set<Citizen>> bookByLastName = new HashMap<>();

    public void add(Citizen citizen) {
        bookByLastName.putIfAbsent(citizen.getLastName(), new TreeSet<>(Comparator.comparing(Citizen::getName)));
        bookByLastName.get(citizen.getLastName()).add(citizen);
    }

    public Collection<Citizen> getByLastName(String lastname) {
        return bookByLastName.get(lastname);
    }
}
