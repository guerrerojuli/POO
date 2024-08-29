package tp04.ej04;

public interface Movable {
    void moveNorth(double delta);

    void moveSouth(double delta);

    void moveWest(double delta);

    void moveEast(double delta);

    default void moveNorthEast(double deltaNorth, double deltaEast) {
        moveNorth(deltaNorth);
        moveEast(deltaEast);
    };

    default void moveNorthWest(double deltaNorth, double deltaWest) {
        moveNorth(deltaNorth);
        moveWest(deltaWest);
    };

    default void moveSouthEast(double deltaSouth, double deltaEast) {
        moveSouth(deltaSouth);
        moveEast(deltaEast);
    };

    default void moveSouthWest(double deltaSouth, double deltaWest) {
        moveSouth(deltaSouth);
        moveWest(deltaWest);
    };
}
