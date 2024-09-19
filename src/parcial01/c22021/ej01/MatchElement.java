package parcial01.c22021.ej01;

public class MatchElement<T> {
    private final T element;
    private final boolean match;

    public MatchElement(T element, boolean match) {
        this.element = element;
        this.match = match;
    }

    public boolean matches() {
        return match;
    }

    @Override
    public String toString() {
        return "### %s : %sMatch ###".formatted(element, (match) ? "" : "No ");
    }
}
