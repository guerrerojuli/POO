package tp05.ej11;

import java.util.Arrays;
import java.util.Comparator;

public class ContinentTester {
    public static void main(String[] args) {
        // Un enum de forma default compara los indices de las constantes
        Continent[] continents = new Continent[]{
                Continent.OCEANIA,
                Continent.AMERICA,
                Continent.EUROPE};
        Arrays.sort(continents, new Comparator<Continent>() {
            @Override
            public int compare(Continent c1, Continent c2) {
                return c1.getPopulation() - c2.getPopulation();
            }
        });
        for(Continent continent : continents) {
            System.out.println(continent);
        }
    }
}
