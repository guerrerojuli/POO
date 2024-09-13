package parcial01.c22022.ej03;

import java.time.LocalDate;

public class Loan {
    private int monto;
    private LocalDate fechaEmision;
    private int cantCuotas;
    private Destinatario dest;

    public Loan(Destinatario dest, int monto, LocalDate fechaEmision, int cantCuotas) {
        if (!dest.esPrestamoValido(monto, cantCuotas)) {
            throw new LoanException("Invalid Loan");
        }
        this.monto = monto;
        this.fechaEmision = fechaEmision;
        this.cantCuotas = cantCuotas;
        this.dest = dest;
    }

    public boolean canPay(int numCuota, LocalDate fechaPago) {
        return fechaPago.isAfter(fechaEmision) && cantCuotas > 0;
    }

    public void pay(int numCuota, LocalDate fechaPago) {
        if (!canPay(numCuota, fechaPago)) {
            throw new LoanException("Cannot pay.");
        }
        System.out.println("Paying quota %d on date %s.".formatted(numCuota, fechaPago.toString()));
        cantCuotas--;
    }

    @Override
    public String toString() {
        return "%s Loan of $%d. Remaining quota: %d".formatted(dest, monto, cantCuotas);
    }
}
