package parcial01.c12023.ej03;

public class InvalidDiscountException extends RuntimeException {
    private static final String MSG = "Invalid Discount for Brand ";
    public InvalidDiscountException(String message) {
        super(MSG + message);
    }
}
