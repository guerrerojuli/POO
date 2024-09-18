package parcial01.c12024.ej01;

import java.time.LocalTime;

public class LastPort extends LimitedPort {
    private Ferry last;

    public LastPort(String name, FerryCompany company, int nDocks, LocalTime open, LocalTime close) {
        super(name, company, nDocks, open, close);
    }

    @Override
    public void dock(Ferry ferry, LocalTime time) {
        super.dock(ferry, time);
        last = ferry;
    }

    @Override
    public void undock(Ferry ferry, LocalTime time) {
        super.undock(ferry, time);
        last = null;
    }

    @Override
    protected boolean canUndock(Ferry ferry) {
        return super.canUndock(ferry) && ferry.equals(last);
    }
}
