package tp06.ej05;

import java.util.List;
import java.util.ArrayList;

public class CompositeFunction implements Function {
    private List<Function> functions = new ArrayList<>();

    public void addFunction(Function f) {
        functions.add(f);
    }

    @Override
    public double evaluate(double x) {
        if (functions.isEmpty())    throw new IllegalStateException();
        double value = x;
        for (Function f : functions) {
            value = f.evaluate(value);
        }
        return value;
    }
}
