package tp01.ej02;

public class Main {
    public static void main(String[] args){
        ComplexNumber c1 = new ComplexNumber(1, 1);
        System.out.println("Real: " + c1.getReal());
        System.out.println("Imaginary: " + c1.getImaginary());

        ComplexNumber c2 = new ComplexNumber(1);
        System.out.println("Real: " + c2.getReal());
        System.out.println("Imaginary: " + c2.getImaginary());

        ComplexNumber c3 = c1.plus(c2);
        System.out.println("Real: " + c3.getReal());
        System.out.println("Imaginary: " + c3.getImaginary());
    }
}
