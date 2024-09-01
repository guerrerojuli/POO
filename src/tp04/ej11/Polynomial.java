package tp04.ej11;

public class Polynomial {
    double[] coefs;

    public Polynomial(int grade) throws InvalidGradeException {
        if (grade < 0) throw new InvalidGradeException();
        coefs = new double[grade + 1];
    }

    public void set(int grade, double value) throws InvalidIndexException {
        if (grade > coefs.length) throw new InvalidIndexException();
        coefs[grade] = value;
    }

    public double eval(double value) {
        double res = 0;
        for (int i = 0; i < coefs.length; i++) {
            res += coefs[i] * Math.pow(value, i);
        }
        return res;
    }
}
