package parcial01.c12021.ej02;

public class TVResponse {
    private final boolean inRange;
    private final TVShow show;

    public TVResponse(TVShow show, boolean inRange) {
        this.show = show;
        this.inRange = inRange;
    }

    @Override
    public String toString() {
        return String.format("%s %s Range", show, (inRange) ? "In" : "Out of");
    }
}
