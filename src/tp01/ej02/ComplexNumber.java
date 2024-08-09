package tp01.ej02;

import java.util.concurrent.CompletableFuture;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber(double real) {
        this.real = real;
        this.imaginary = 0;
    }

    public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
        double real = c1.real + c2.real;
        double imaginary = c1.imaginary + c2.imaginary;
        return new ComplexNumber(real, imaginary);
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
