package tp02.ej03;

public class Deletrear {
    public static void main(String[] args) {
        for (String arg : args) {
            int i;
            for (i = 0; i < arg.length() - 1; i++) {
                System.out.print(arg.charAt(i) + "-");
            }
            System.out.println(arg.charAt(i));
        }
    }
}
