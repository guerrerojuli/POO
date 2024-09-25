package tp06.ej02;

import java.util.ArrayList;
import java.util.List;

public class Ej2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(6);
        list.add(8);
        list.add(10);
        for (Integer i : list) {
            // El error obtenido es que se realiza un cambio en la coleccion y luego se usa el iterador por lo que da un error.
            if (i % 2 == 0) {
                list.remove(i);
            }
        }
    }
}
