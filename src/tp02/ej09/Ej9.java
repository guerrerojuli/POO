package tp02.ej09;

public class Ej9 {
    public static void main(String[] args) {
        Integer[][] matriz = new Integer[3][4];
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 4; j++) {
                matriz[i][j] = 3 - j + i;
            }
        }
    }
}
