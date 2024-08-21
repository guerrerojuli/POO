package tp02.ej03;

public class Deletrear {
    public static void main(String[] args) {
        for (String arg : args) {
            StringBuilder print = new StringBuilder();
            for (char c : arg.toCharArray()) {
                if (!print.isEmpty()) {
                    print.append("-");
                }
                print.append(c);
            }
            System.out.println(print.toString());
        }
    }
}
