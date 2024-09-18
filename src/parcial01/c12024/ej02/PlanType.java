package parcial01.c12024.ej02;

import java.util.function.Function;

public enum PlanType {
    BASIC(12) {
        @Override
        public double apply(double installmentAmount, int installment) {
            return installmentAmount;
        }
    },
    THREE_MONTH(24) {
        @Override
        public double apply(double installmentAmount, int installment) {
            return (installment <= 3) ? 0 : installmentAmount;
        }
    },
    FIFTY(360) {
        @Override
        public double apply(double installmentAmount, int installment) {
            return (installment % 2 == 0) ? installmentAmount / 2 : installmentAmount;
        }
    };

    private final int maxInstallments;

    PlanType(int maxInstallments) {
        this.maxInstallments = maxInstallments;
    }

    public boolean isValid(int installments) {
        return installments <= maxInstallments;
    }

    public abstract double apply(double installmentAmount, int installment);
}
