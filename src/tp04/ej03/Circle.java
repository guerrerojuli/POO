package tp04.ej03;

public class Circle extends Ellipse {
    public Circle(Point center, double radius) {
        super(center, radius, radius);
    }

    public String toString() {
        return "Circulo [Centro: " + getCenter() + " , Radio: " + getAxisA() + "]";
    }
}