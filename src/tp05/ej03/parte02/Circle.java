package tp05.ej03.parte02;

public class Circle extends Ellipse {
    public Circle(Point center, double radius) {
        super(center, radius, radius);
    }

    public String toString() {
        return "Circulo [Centro: " + getCenter() + " , Radio: " + getAxisA() + "]";
    }
}
