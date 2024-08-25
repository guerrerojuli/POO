package tp03.ej04;

public class Ej4 {
    public static void main(String[] args) {
        ClassA a = new ClassB();
        a.method(3);

        // ClassB b = new ClassA();
        // b.method(3);

        ClassB b = new ClassB();
        b.method(3);

        b.method((Number)3);

        // a = new ClassA();
        // b = (ClassB)a;
        // b.method(3);

        b = new ClassB();
        a = (ClassA)b;
        a.method(3);
    }
}
