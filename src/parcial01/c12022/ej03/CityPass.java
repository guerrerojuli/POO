package parcial01.c12022.ej03;

import java.time.LocalDate;

public interface CityPass {
    // Registra una visita a la atracción en una fecha
    void visit(Attraction attraction, LocalDate date);

    // Retorna las atracciones aceptadas por el pase
    Attraction[] getAttractions();

    // Retorna verdadero si una atracción es aceptada por el pase
    default boolean belongsIn(Attraction attraction) {
        for (Attraction value : getAttractions()) {
            if (value.equals(attraction)) {
                return true;
            }
        }
        return false;
    }
}
