package taller07.ej03;

import java.util.TreeSet;

public class CategoryBoardingFlight extends BoardingFlight {
    public CategoryBoardingFlight() {
        super(new TreeSet<>((p1, p2) -> {
            int cmp = p1.getCategory().compareTo(p2.getCategory());
            if (cmp == 0)   cmp = p1.compareTo(p2);
            return cmp;
        }));
    }
}
