package taller05.ej01;

import java.time.LocalTime;

public class Port24hs extends Port {

    public Port24hs(String name, FerryCompany company, int nDocks) {
        super(name, company, nDocks);
    }

    @Override
    public void dock(Ferry f, LocalTime time) throws Exception {
        /*
        if (nDocks == nDocked || company.equals(f.getCompany())) {
            throw new Exception("No se ha podido amarrar el ferry");
        }
        docks[nDocked++] = f;
         */
    }

    @Override
    public void undock(Ferry f, LocalTime time) throws Exception {
        /*
        if (nDocked == 0) {
            throw new Exception("No hay ferrys para desamarrar");
        }
        for (int i = 0; i < nDocked; i++) {
            if (docks[i].equals(f)) {
                docks[i] = docks[--nDocked];
            }
        }
         */
    }


}
