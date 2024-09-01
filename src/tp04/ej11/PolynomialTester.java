package tp04.ej11;

public class PolynomialTester {
    public static void main(String[] args) throws InvalidGradeException, InvalidIndexException {
        Polynomial fourthGradePol = new Polynomial(4);
        fourthGradePol.set(2, 3.1); // 3.1 * x^2
        fourthGradePol.set(3, 2); // 2 * x^3 + 3.1 * x^2
        System.out.println(fourthGradePol.eval(2)); // 28.4
        System.out.println(new Polynomial(3).eval(5)); // 0
        try {
            new Polynomial(-4);
        } catch (InvalidGradeException e) {
            System.out.println(e.getMessage()); // 0
        }
        fourthGradePol.set(7, 1.5); // 1.5 * x^7
    }

}
