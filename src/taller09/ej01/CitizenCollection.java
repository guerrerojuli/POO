package taller09.ej01;

import java.util.*;

public class CitizenCollection {
    private final Map<Integer, Citizen> byDni = new TreeMap<>();
    private final Map<String, Map<String, Citizen>> byName = new HashMap<>();


    public Citizen get(Integer dni) {
        return byDni.get(dni);
    }

    public Collection<Citizen> get(String name) {
        return byName.getOrDefault(name, new HashMap<>()).values();
    }

    public Citizen get(String name, String lastname) {
        return byName.getOrDefault(name, new HashMap<>()).get(lastname);
    }
}
