package tp05.ej08;

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
        Pair<String, String>[] otherPairArray = new Pair[4];
        otherPairArray[1] = stringPair1;
        otherPairArray[2] = stringPair2;
        otherPairArray[3] = stringPair3;
        Arrays.sort(otherPairArray); // Da error pues en la posicion 0 no contiene nada e intenta desreferenciar
        System.out.println(Arrays.toString(otherPairArray));
    }
}
