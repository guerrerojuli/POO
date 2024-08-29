package tp04.ej04;

public class Point implements Movable {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distanceTo(Point point) {
       return Math.sqrt(
               Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2)
       );
    }

    @Override
    public String toString() {
        return "{%g, %g}".formatted(x, y);
    }

    @Override
    public void moveNorth(double delta) { y += delta; }

    @Override
    public void moveSouth(double delta) { y -= delta; }

    @Override
    public void moveWest(double delta) { x -= delta; }

    @Override
    public void moveEast(double delta) { x += delta; }
}
