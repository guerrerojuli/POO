package tp05.ej11;

public enum Continent implements Comparable<Continent> {
    AFRICA("África", 1100, 30),
    AMERICA ("América", 990, 42),
    ASIA("Asia", 4400, 43),
    EUROPE("Europa", 730, 10),
    OCEANIA("Oceanía", 39, 9);

    private String name;
    private int population;
    private int area;

    Continent(String name, int population, int area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public double getPopulationRatio() {
        return (double) population / area;
    }

    public int getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return name;
    }

    /*
    no se puede pues Enum la implementa de forma final
    @Override
    public int compareTo(Continent c) {
        return 1;
    }
     */

}
