package parcial01.c22021.ej02;

public class ReachedLimitException extends RuntimeException {
    private static final String MESSAGE = "Reached limit of %d people";

    public ReachedLimitException(int limit) {
        super(MESSAGE.formatted(limit));
    }
}
