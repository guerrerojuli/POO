package taller05.ej02;

import java.util.Arrays;
import java.util.Comparator;

public class Counter implements Comparable<Counter> {
    private String name;
    private int num;
    private boolean isCheckingIn;

    public Counter(String name, int num) {
        this.name = name;
        this.num = num;
        this.isCheckingIn = false;
    }

    @Override
    public String toString() {
        return "Counter %d for %s is %s".formatted(num, name, (isCheckingIn) ? "checking in" : "idle");
    }

    public String getName() {
        return name;
    }

    public void checkIn() {
        isCheckingIn = true;
    }

    @Override
    public int compareTo(Counter c) {
        int cmp = name.compareTo(c.name);
        if (cmp == 0)
           cmp = Integer.compare(num, c.num);

        return cmp;
    }

    public boolean isCheckingIn() {
        return isCheckingIn;
    }
}
