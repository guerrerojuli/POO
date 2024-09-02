package tp04.ej15;

public enum ExtendedOperation implements Operation {
    POW("^", (x, y) -> Math.pow(x, y)),
    MOD("%", (x, y) -> x % y);

    private final String symbol;
    private final Operation operation;

    ExtendedOperation(String symbol, Operation operation) {
        this.symbol = symbol;
        this.operation = operation;
    }

    @Override
    public String toString() {
        return symbol;
    }

    public double apply(double x, double y) {
        return operation.apply(x, y);
    }
}
