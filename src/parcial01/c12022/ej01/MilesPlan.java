package parcial01.c12022.ej01;

public enum MilesPlan {
    Club1000(1000, 0, 0, 950),
    Club2000(2000, 2, 1000, 1750),
    Club5000(5000, 5, 2500, 4400),
    Club10000(10000, 6, 10000, 14400);

    private final int monthMiles;
    private final int monthsBonus;
    private final int bonusMiles;
    private final double cost;

    MilesPlan(int monthMiles, int monthsBonus, int bonusMiles, int cost) {
        this.monthMiles = monthMiles;
        this.monthsBonus = monthsBonus;
        this.bonusMiles = bonusMiles;
        this.cost = cost;
    }

    private int getMonthsBonus(int month) {
        return (month <= monthsBonus) ? bonusMiles : 0;
    }

    public int getMiles(int month) {
        return monthMiles + getMonthsBonus(month);
    }

    public double getCost() {
        return cost;
    }
}
