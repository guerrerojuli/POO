package tp02.ej07;

import java.lang.reflect.MalformedParameterizedTypeException;

public class Histograma {
    private static final int N_BUCKETS = 10;
    private static final int SCALE = 10;
    public static void main(String[] args) {
        int[] histogram = new int[N_BUCKETS];
        int maxFrequency = 0;
        for (String arg : args) {
            int i = Integer.parseInt(arg);
            if (i < 0) throw new IllegalArgumentException(arg);
            int aux = (++histogram[i / N_BUCKETS]);
            if (aux > maxFrequency) maxFrequency = aux;
        }
        String str = generateHistogram(histogram, maxFrequency);
        System.out.println(str);
    }

    private static String generateHistogram(int[] histogram, int maxFrequency) {
        StringBuilder str = new StringBuilder();

        // Generate columns
        for (int i = maxFrequency; i > 0; i--) {
            str.append("|");
            for (int data : histogram) {
                str.append((data >= i) ? " * " : "   ");
                str.append("|");
            }
            str.append("\n");
        }

        String footer = generateHistogramFooter(histogram);
        str.append(footer);

        return str.toString();
    }

    private static String generateHistogramFooter(int[] histogram) {
        StringBuilder str = new StringBuilder();

        str.append("+");
        for (int i = 0; i < histogram.length; i++) {
            str.append("---+");
        }
        str.append("\n");

        for (int i = 0; i <= histogram.length; i++) {
            str.append(String.format("%-4d", i * histogram.length));
        }

        return str.toString();
    }



}
