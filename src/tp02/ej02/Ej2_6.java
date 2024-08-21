package tp02.ej02;

public class Ej2_6 {
    public static void main(String[] args) {
        long x = 3;
        long y = 2;
        int rta;
        rta = sumar((int) x, (int) y);
        System.out.println(rta);
    }


    private static int sumar(int a, int b) {
        return a + b;
    }
}
