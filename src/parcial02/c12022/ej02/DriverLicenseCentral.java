package parcial02.c12022.ej02;

import java.util.*;
import java.time.*;

public class DriverLicenseCentral {
    private final Map<String, PointsHistory> driverPoints;

    public DriverLicenseCentral() {
        driverPoints = new HashMap<>();
    }

    public void register(String driver, Integer points) {
        driverPoints.put(driver, new PointsHistory(points));
    }

    public int points(String driver) {
        checkDriverExists(driver);
        return driverPoints.get(driver).getPoints();
    }

    public void infraction(String driver, LocalDate date, Infraction infraction) {
        checkDriverExists(driver);
        if (driverPoints.get(driver).hasInfraction(date)) {
            throw new IllegalArgumentException("Infraction already exists for driver and date");
        }
        driverPoints.get(driver).addInfraction(date, infraction);
    }

    public Set<LocalDate> getInfractionDates(String driver) {
        checkDriverExists(driver);
        return driverPoints.get(driver).getDates();
    }

    public Collection<Infraction> getInfractionTypes(String driver) {
        checkDriverExists(driver);
        return driverPoints.get(driver).getInfractions();
    }

    private void checkDriverExists(String driver) {
        if (!driverPoints.containsKey(driver)) {
            throw new IllegalArgumentException("Driver does not exist");
        }
    }
}
