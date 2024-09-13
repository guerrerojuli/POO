package taller05.ej01;

import java.time.LocalTime;

public abstract class Port {
    private String name;
    private FerryCompany company;
    private Ferry[] docks;
    private int nDocks;
    private int nDocked;

    public Port(String name, FerryCompany company, int nDocks) {
        this.name = name;
        this.company = company;
        this.nDocks = nDocks;
        this.docks = new Ferry[nDocks];
        this.nDocked = 0;
    }

    public abstract void dock(Ferry f, LocalTime time) throws Exception;

    public abstract void undock(Ferry f, LocalTime time) throws Exception;

    protected void setnDocks() {
    }
}
