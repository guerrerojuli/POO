package tp05.ej10;

import java.util.Arrays;

public class PairArrayTester {
    public static void main(String[] args) {
        Pair<String, String> stringPair1 = new Pair<>("hola", "mundo");
        Pair<String, String> stringPair2 = new Pair<>("hola", "adiós");
        Pair<String, String> stringPair3 = new Pair<>("buen", "día");
        /* si no se implementa Comparable en Pair da error de ejecucion */
        Pair pairArray[] = new Pair[]{stringPair1, stringPair2, stringPair3};
        Arrays.sort(pairArray);
        System.out.println(Arrays.toString(pairArray));
    }
}
