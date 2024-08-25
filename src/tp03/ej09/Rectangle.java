package tp03.ej09;

public class Rectangle extends Figure {
    private Point corner1, corner2;

    public Rectangle(Point corner1, Point corner2) {
        this.corner1 = corner1;
        this.corner2 = corner2;
    }

    public double perimeter() {
        return 2 * base() + 2 * height();
    }

    public double area() {
        return base() * height();
    }

    public double base() {
        return Math.abs(corner1.getX() - corner2.getX());
    }

    public double height() {
        return Math.abs(corner1.getY() - corner2.getY());
    }

    @Override
    public String toString() {
       return "Rectangulo [ " + corner1 + " , " + corner2 + " ]";
    }
}
