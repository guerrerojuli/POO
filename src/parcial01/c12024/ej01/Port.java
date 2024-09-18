package parcial01.c12024.ej01;

import java.time.LocalTime;

public class Port {
    private final String name;
    private final FerryCompany company;
    private final int nDocks;
    private int nDocked;

    public Port(String name, FerryCompany company, int nDocks) {
        this.name = name;
        this.company = company;
        this.nDocks = nDocks;
    }

    public void dock(Ferry ferry, LocalTime time) {
        if (!canDock(ferry, time)) {
            throw new RuntimeException("Error");
        }
        System.out.println("%s docked at Port %s".formatted(ferry, name));
        nDocked++;
    }

    public void undock(Ferry ferry, LocalTime time) {
        if (!canUndock(ferry)) {
            throw new RuntimeException("Error");
        }
        System.out.println("%s undocked at Port %s".formatted(ferry, name));
        nDocked--;
    }

    protected boolean canDock(Ferry ferry, LocalTime time) {
        return (nDocks > nDocked && ferry.getCompany().equals(company));
    }

    protected boolean canUndock(Ferry ferry) {
        return (nDocked > 0);
    }
}
