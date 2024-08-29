package tp04.ej03;

public class Triangle extends Figure {
    private Point corner1, corner2, corner3;

    Triangle(Point corner1, Point corner2, Point corner3) {
        this.corner1 = corner1;
        this.corner2 = corner2;
        this.corner3 = corner3;
    }

    public double perimeter() {
        return corner1.distanceTo(corner2) + corner2.distanceTo(corner3) + corner3.distanceTo(corner1);
    }

    public double area() {
        double p = perimeter()/2;
        return Math.sqrt(p * (p - corner1.distanceTo(corner2)) * (p - corner2.distanceTo(corner3)) * (p - corner3.distanceTo(corner1)));
    }

    @Override
    public String toString() {
        return "Triangulo [ " + corner1 + " , " + corner2 + " , " + corner3 + " ]";
    }

    @Override
    public void moveNorth(double delta) {
        corner1.moveNorth(delta);
        corner2.moveNorth(delta);
        corner3.moveNorth(delta);
    }

    @Override
    public void moveSouth(double delta) {
        corner1.moveSouth(delta);
        corner2.moveSouth(delta);
        corner3.moveSouth(delta);
    }

    @Override
    public void moveWest(double delta) {
        corner1.moveWest(delta);
        corner2.moveWest(delta);
        corner3.moveWest(delta);
    }

    @Override
    public void moveEast(double delta) {
        corner1.moveEast(delta);
        corner2.moveEast(delta);
        corner3.moveEast(delta);
    }
}
