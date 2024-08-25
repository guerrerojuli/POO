package tp03.ej09;

public class Point {
    private final double x, y;

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
}
