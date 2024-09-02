package tp04.ej15;

public enum BasicOperation  implements  Operation {
    ADD("+", (x, y) -> x + y),
    SUB("-", (x, y) -> x - y),
    MULT("*", (x, y) -> x * y),
    DIV("/", (x, y) -> x / y);

    private final String symbol;
    private final Operation operation;


    BasicOperation(String symbol, Operation operation) {
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
