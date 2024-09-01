package tp04.ej07;

public class IntervalTester {
    public static void main(String[] args) {
        // Ejemplo de invocación con start menor que end e incremento positivo
        Interval interval = new Interval(-1, 1, 0.5);
        System.out.println(interval);
        System.out.println(interval.size());
        System.out.println(interval.at(3));
        System.out.println(interval.indexOf(0.5));
        System.out.println(interval.includes(0.5));
        System.out.println(interval.equals(new Interval(-1, 1, 0.5)));
        System.out.println(interval.hashCode() == new Interval(-1, 1, 0.5).hashCode());


        // Ejemplo de invocación con start mayor que end e incremento negativo
        Interval otherInterval = new Interval(1, -1, -0.5);
        System.out.println(otherInterval);
        System.out.println(otherInterval.size());
        System.out.println(otherInterval.at(3));
        System.out.println(otherInterval.indexOf(0.5));
        System.out.println(otherInterval.includes(0.5));


        // Ejemplo de invocación con incremento por defecto
        Interval anotherInterval = new Interval(7, 10);
        System.out.println(anotherInterval);
    }

}
