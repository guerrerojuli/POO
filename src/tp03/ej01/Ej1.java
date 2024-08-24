package tp03.ej01;

public class Ej1 {
    public static void main(String[] args) {
        String s1, s2;
        s1 = new String("hola");
        s2 = new String("hola");
        if (s1 == s2) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }
        if (s1.equals(s2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }
        String s3, s4;
        s3 = new String("hola");
        s4 = s3;
        if (s3 == s4) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintos");
        }
    }
}
