package parcial01.c12024.ej03;

public class Counter implements Comparable<Counter> {
    private final String name;
    private final int num;
    private boolean checkedIn;

    public Counter(String name, int num) {
        this.name = name;
        this.num = num;
        this.checkedIn = false;
    }

    public void checkIn() {
        checkedIn = true;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Counter %d for %s is %s".formatted(num, name, getState());
    }

    public String getState() {
        return (checkedIn) ? "checking in" : "idle";
    }

    @Override
    public int compareTo(Counter c) {
        int cmp = name.compareTo(c.name);
        if (cmp == 0)   cmp = num - c.num;
        return cmp;
    }
}
