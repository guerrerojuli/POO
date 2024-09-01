package taller04;

import java.util.Arrays;

public class ArrayIntegerList implements List<Integer>{
    public Integer[] array;
    private int elementNum = 0;
    private static final int SIZE_BLOCK = 10;


    public ArrayIntegerList() {
        array = new Integer[0];
    }

    private void resize() {
        array = Arrays.copyOf(array, array.length + SIZE_BLOCK);
    }

    @Override
    public void add(Integer element) {
        if (elementNum == array.length) resize();
        array[elementNum++] = element;
    }

    @Override
    public int indexOf(Integer element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void removeAt(int index) {
        if (index < 0 || elementNum <= index) return;
        System.arraycopy(array, index + 1, array, index, elementNum - index - 1);
        elementNum -= 1;
    }

    @Override
    public boolean isEmpty() {
        return elementNum == 0;
    }
}
