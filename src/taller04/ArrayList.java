package taller04;

import java.util.Arrays;

public class ArrayList<T> implements List<T>{
    public T[] array;
    private int elementNum = 0;
    private static final int SIZE_BLOCK = 10;


    public ArrayList() {
        array = (T[]) new Object[SIZE_BLOCK];
    }

    private void resize() {
        array = Arrays.copyOf(array, array.length + SIZE_BLOCK);
    }

    @Override
    public void add(T element) {
        if (elementNum == array.length) resize();
        array[elementNum++] = element;
    }

    @Override
    public int indexOf(T element) {
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
