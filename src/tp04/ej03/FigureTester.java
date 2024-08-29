package tp04.ej03;

public class FigureTester {
    public static void main(String[] args) {
        Ellipse myEllipse = new Ellipse(new Point(0, 0), 2, 1);
        System.out.println(myEllipse);
        System.out.println("%.2f".formatted(myEllipse.perimeter()));
        System.out.println("%.2f".formatted(myEllipse.area()));
        myEllipse.moveNorth(10);
        System.out.println(myEllipse);
        myEllipse.moveSouth(15);
        System.out.println(myEllipse);
        myEllipse.moveWest(17);
        System.out.println(myEllipse);
        myEllipse.moveEast(9);
        System.out.println(myEllipse);
    }
}