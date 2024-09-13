package parcial01.c22022.ej03;

import java.time.LocalDate;

public class LoanLastDate extends LoanLastQuota {
    private LocalDate lastDate;

    public LoanLastDate(Destinatario dest, int monto, LocalDate fechaEmision, int cantCuotas) {
        super(dest, monto, fechaEmision, cantCuotas);
        lastDate = fechaEmision;
    }

    @Override
    public boolean canPay(int numCuota, LocalDate fechaPago) {
        return lastDate.isBefore(fechaPago) && super.canPay(numCuota, fechaPago);
    }

    @Override
    public void pay(int numCuota, LocalDate fechaPago) {
        super.pay(numCuota, fechaPago);
        lastDate = fechaPago;
    }

    @Override
    public String toString() {
        return super.toString() + " Next PayDate: After %s.".formatted(lastDate);
    }

}
