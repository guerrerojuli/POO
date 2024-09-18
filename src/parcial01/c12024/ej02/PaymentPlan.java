package parcial01.c12024.ej02;

import java.util.Iterator;

public class PaymentPlan implements Iterator<PaymentDetail> {
    private PlanType type;
    private double total;
    private int installments;
    private int current;

    public PaymentPlan (PlanType type, double total, int installments) {
        this.type = type;
        if (!type.isValid(installments) || installments < 1 || total < 1) {
            throw new InvalidPaymentPlanException();
        }
        this.total = total;
        this.installments = installments;
        this.current = 1;
    }


    @Override
    public boolean hasNext() {
        return (current <= installments);
    }

    @Override
    public PaymentDetail next() {
        if (!hasNext()) throw new RuntimeException("No more installments");
        return new PaymentDetail(current, type.apply(total/installments, current++));
    }

    public PaymentDetail peek() {
        if (!hasNext()) throw new RuntimeException("No more installments");
        return new PaymentDetail(current, type.apply(total/installments, current));
    }
}
