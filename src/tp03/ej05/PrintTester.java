package tp03.ej05;

public class PrintTester {
    public static void main(String[] args) {
        A a = new A();
        a.print(3);
        a.print(3.14);
        a.print((Number)3);
        a.print((Object)3);

        A b1 = new B();
        b1.print(3.14);
        b1.print("Hola");
        b1.print((Number)3);
        b1.print((Object)3);

        B b2 = new B();
        b2.print(3.14);
        b2.print("Hola");
        b2.print((Number)3);
        b2.print((Object)3);
    }
}
