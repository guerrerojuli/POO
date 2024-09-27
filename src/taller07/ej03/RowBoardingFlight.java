package taller07.ej03;

import java.util.TreeSet;

public class RowBoardingFlight extends BoardingFlight {
    public RowBoardingFlight() {
       super(new TreeSet<>((p1, p2) -> {
           int cmp = p1.getRow() - p2.getRow();
           if (cmp == 0)    cmp = p1.compareTo(p2);
           return cmp;
       }));
    }
}
