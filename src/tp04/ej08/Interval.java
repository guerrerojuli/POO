package tp04.ej08;

import java.util.Objects;

public class Interval {
    private double start;
    private double end;
    private double increment;

    public Interval(double start, double end, double increment) {
        if (increment == 0) throw new IllegalArgumentException("El incremento no puede ser 0");
        if ((start > end && increment > 0) || (start < end && increment < 0)){
            throw new IllegalArgumentException("Intervalo mal definido");
        }
        this.start = start;
        this.end = end;
        this.increment = increment;
    }

    public Interval(double start, double end) {
        this(start, end, 1);
    }

    public long size() {
        return (long) ((end - start) / increment) + 1;
    }

    public double at(long index) {
        if (index > size() || index < 0) {
            throw new IllegalArgumentException();
        }
        return start + index * increment;
    }

    public long indexOf(double value) {
        double end = this.end, start = this.start;
        if( this.start > this.end){
            end = this.start;
            start = this.end;
        }
        for(long i = 0; i < size(); i++){
            if(value == at(i)){
                return i;
            }
        }

        return -1;
    }

    public boolean includes(double value) {
        return indexOf(value) != -1;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        str.append("[");
        for (int i = 0; i < size(); i++) {
            if (i != 0) str.append(", ");
            str.append(at(i));
        }
        str.append("]");
        return str.toString();
    }

    @Override
    public boolean equals(Object other) {
        return other instanceof  Interval otherI && otherI.start == start && otherI.end == end && otherI.increment == increment;
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end, increment);
    }

    public int count(IntervalCondition iCondition) {
        int count = 0;
        for (int i = 0; i < size(); i++) {
            if (iCondition.condition(at(i))) count++;
        }
        return count;
    }
}
