package taller01.ej02;

public class TestCounter {
    public static void main(String[] args) {

        Counter counter = new Counter();
        System.out.println("Expected 0: " + counter.getCount());
        counter.increment();
        System.out.println("Expected 1: " + counter.getCount());
        counter.increment();
        System.out.println("Expected 2: " + counter.getCount());
        counter.decrement();
        System.out.println("Expected 1: " + counter.getCount());
    }
}