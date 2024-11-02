package parcial02.c12022.ej02;

import java.util.*;
import java.time.*;

public class PointsHistory {
    private int points;
    private final Map<LocalDate, Infraction> infractions;
    

    public PointsHistory(int points) {
        this.points = points;
        this.infractions = new TreeMap<>();
    }

    public int getPoints() {
        return points;
    }

    public Set<LocalDate> getDates() {
        return new TreeSet<>(infractions.keySet());
    }

    public Collection<Infraction> getInfractions() {
        return new ArrayList<>(infractions.values());
    }

    public void addInfraction(LocalDate date, Infraction infraction) {
        infractions.put(date, infraction);
        points -= infraction.getPoints();
    }

    public boolean hasInfraction(LocalDate date) {
        return infractions.containsKey(date);
    }
}
