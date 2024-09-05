package tp05.ej07;

import java.util.Arrays;

public class ArrayTester {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[]{7, 3, 1, 5, 9};
        System.out.println(Arrays.toString(intArray)); // [7, .., 9]
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray)); // [1, ..., 9]
    }
}
