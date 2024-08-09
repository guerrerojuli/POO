package taller01.ej03;

public class TestMultipleCounter {
    public static void main(String[] args) {
        MultipleCouter multipleCouter = new MultipleCouter(5);

        System.out.println("Expected 0: " + multipleCouter.getCount());
        multipleCouter.increment();
        System.out.println("Expected 5: " + multipleCouter.getCount());
        multipleCouter.increment();
        System.out.println("Expected 10: " + multipleCouter.getCount());
        multipleCouter.decrement();
        System.out.println("Expected 5: " + multipleCouter.getCount());
    }
}
