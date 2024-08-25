package tp03.ej03;

public class Ej3 {
    public static void main(String[] args) {
        Point p = new Point(2, 1);
        Point p1 = new Point(2, 1);
        Point p2 = new Point(2, 1);
        Point[] points = new Point[10];

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        // System.out.println(p1.getX().equals(p2.getX()) && p1.getY().equals(p2.getY()));

        System.out.println(p instanceof Object);
        // Point p = new Point();
        // System.out.println(p);

        // for (Point point : points) {
        //     System.out.println(point.getX() + ", " + point.getY());
        // }
        System.out.println(p);
    }
}
