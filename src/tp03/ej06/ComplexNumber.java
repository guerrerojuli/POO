package tp03.ej06;

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

    public ComplexNumber plus(double n) {
        return new ComplexNumber(this.real + n, this.imaginary);
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        return real + " + " + imaginary;
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof ComplexNumber c && this.real == c.real && this.imaginary == c.imaginary;
    }
}
