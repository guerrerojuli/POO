package tp01.ej02;

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

    public ComplexNumber plus(ComplexNumber c) {
        double real = this.real + c.real;
        double imaginary = this.imaginary + c.imaginary;
        return new ComplexNumber(real, imaginary);
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }
}
