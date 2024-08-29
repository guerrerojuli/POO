package tp04.ej04;

public class Ellipse extends Figure {
    private Point center;
    private double axisA;
    private double axisB;

    public Ellipse (Point center, double axisA, double axisB) {
        this.center = center;
        this.axisA = axisA;
        this.axisB = axisB;
    }

    public double perimeter() {
        return 2 * Math.PI * Math.sqrt(((axisA * axisA) + (axisB * axisB)) / 2);
    }

    public double area() {
        return Math.PI * axisA * axisB;
    }

    protected Point getCenter() {
        return center;
    }

    protected double getAxisA() {
        return axisA;
    }

    protected double getAxisB() {
        return axisB;
    }

    @Override
    public String toString() {
        return "Ellipse: [Centro: " + center + ", DMayor: " + Math.max(axisA, axisB) + ", DMenor: " + Math.min(axisA, axisB) + "]";
    }

    @Override
    public void moveNorth(double delta) { center.moveNorth(delta); }

    @Override
    public void moveSouth(double delta) { center.moveSouth(delta); }

    @Override
    public void moveWest(double delta) { center.moveWest(delta); }

    @Override
    public void moveEast(double delta) { center.moveEast(delta); }
}
