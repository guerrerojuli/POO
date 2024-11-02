package parcial02.c12024.ej02;

import java.time.YearMonth;
import java.util.Map;

public class ReimbursementTrackerTester {
    public static void main(String[] args) {

        // Ejemplo de uso de la clase java.time.YearMonth
        YearMonth june2024 = YearMonth.of(2024, 6);
        System.out.println(june2024); // 2024-06
        System.out.println(june2024.compareTo(YearMonth.of(2024, 7))); // -1


        // Se instancia un sistema para llevar registros de los reintegros de los clientes
        ReimbursementTracker rT = new ReimbursementTracker();


// Se registra al cliente "Sam" con un tope de reintegro de $10.000 para cada mes
        rT.registerClient("Sam", 10_000);


// Se consulta el monto de reintegro restante para "Sam" en Junio 2024
        System.out.println(rT.getRemainingReimbursement("Sam", june2024)); // 10000
        System.out.println(rT.getRemainingReimbursement("Sam", YearMonth.of(2024, 7))); // 10000


// Se registra un reintegro para "Sam" en Junio 2024 con un monto de $3.000
        rT.addReimbursement("Sam", june2024, 3_000);


        System.out.println(rT.getRemainingReimbursement("Sam", june2024)); // 7000
        System.out.println(rT.getRemainingReimbursement("Sam", YearMonth.of(2024, 7))); // 10000


        rT.addReimbursement("Sam", june2024, 1_000);
        rT.addReimbursement("Sam", YearMonth.of(2024, 7), 7_000);


        System.out.println(rT.getRemainingReimbursement("Sam", june2024)); // 6000
        System.out.println(rT.getRemainingReimbursement("Sam", YearMonth.of(2024, 7))); // 3000


        try {
            // De registrarse el reintegro superaría el tope de reintegro del mes de "Sam"
            rT.addReimbursement("Sam", june2024, 7_000);
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // Reimbursement surpasses month cap.
        }


        rT.addReimbursement("Sam", YearMonth.of(2024, 3), 5_000);
// Se obtienen todos los meses año con reintegros y el total correspondiente
// para el cliente "Sam" en orden cronológico
// listando únicamente los meses año [Enero 2024, Julio 2024)
        for(Map.Entry<YearMonth, Integer> samReimbursements : rT.getReimbursements("Sam",
                YearMonth.of(2024, 1), YearMonth.of(2024, 7))) {
            System.out.printf("Client Sam earned $%d in %s\n", samReimbursements.getValue(), samReimbursements.getKey());
        }
// Client Sam earned $5000 in 2024-03
// Client Sam earned $4000 in 2024-06


        System.out.println(rT.getReimbursements("Sam", june2024, june2024).isEmpty()); // true


        rT.registerClient("Ben", 5_000);
        System.out.println(rT.getRemainingReimbursement("Ben", june2024)); // 5000
        System.out.println(rT.getReimbursements("Ben", june2024, YearMonth.of(2025, 12)).isEmpty());
// true


        try {
            rT.registerClient("Ben", 5_000);
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // Client already registered.
        }
        try {
            rT.addReimbursement("Adam", YearMonth.of(2000, 1), 1_000);
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // Client is not registered.
        }
        try {
            rT.getRemainingReimbursement("Adam", YearMonth.of(2000, 1));
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // Client is not registered.
        }
        try {
            rT.getReimbursements("Adam", YearMonth.of(2000, 1), YearMonth.of(2001, 1));
        } catch (Exception ex) {
            System.out.println(ex.getMessage()); // Client is not registered.

        }
    }
}
