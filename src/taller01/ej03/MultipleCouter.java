package taller01.ej03;

import taller01.ej02.Counter;

public class MultipleCouter extends Counter {
    private final int factor;

    public MultipleCouter(int factor) {
        super();
        this.factor = factor;
    }

    @Override
    public void increment() {
        for(int i = 0; i < this.factor; i++) {
            super.increment();
        }
    }

    @Override
    public void decrement() {
        for(int i = 0; i < this.factor; i++) {
            super.decrement();
        }
    }
}
