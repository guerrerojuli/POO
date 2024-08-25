package tp03.ej09;

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
}
