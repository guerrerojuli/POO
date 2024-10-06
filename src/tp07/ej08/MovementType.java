package tp07.ej08;

public enum MovementType {
    DEPOSIT("Deposit"), EXTRACTION("Extraction");

    private final String type;

    MovementType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return type;
    }
}
