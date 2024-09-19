package parcial01.c22021.ej03;

public enum Chairlift {
    AMANCAY(false),
    HORSETOOTH(true),
    SIXFOLD(false);

    private final boolean forVisitor;

    Chairlift(boolean forVisitor){
        this.forVisitor = forVisitor;
    }

    public boolean allowed(Ticket ticket) {
        return ticket.isForSki() || forVisitor;
    }
}
