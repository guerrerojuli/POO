package parcial01.c22022.ej03;

import java.time.LocalDate;

public class LoanLastQuota extends Loan {
    private int lastQuota;

    public LoanLastQuota(Destinatario dest, int monto, LocalDate fechaEmision, int cantCuotas) {
        super(dest, monto, fechaEmision, cantCuotas);
        lastQuota = 0;
    }

    @Override
    public boolean canPay(int numCuota, LocalDate fechaPago) {
        return lastQuota == numCuota - 1 && super.canPay(numCuota, fechaPago);
    }

    @Override
    public void pay(int numCuota, LocalDate fechaPago) {
        super.pay(numCuota, fechaPago);
        lastQuota = numCuota;
    }

    @Override
    public String toString() {
        return super.toString() + " Last quota: %d.".formatted(lastQuota);
    }
}
