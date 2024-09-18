package parcial01.c12024.ej01;

import java.time.LocalTime;

public class LimitedPort extends Port {
    private final LocalTime open;
    private final LocalTime close;

    public LimitedPort(String name, FerryCompany company, int nDocks, LocalTime open, LocalTime close) {
        super(name, company, nDocks);
        this.open = open;
        this.close = close;
    }

    @Override
    protected boolean canDock(Ferry ferry, LocalTime time){
        return super.canDock(ferry, time) && !time.isBefore(open) && !time.isAfter(close);
    }
}
