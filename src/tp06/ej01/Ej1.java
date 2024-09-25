package tp06.ej01;

import java.util.ArrayList;
import java.util.List;

public class Ej1 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList(); //valido, se infiere el tipo
        List<Integer> list2 = new ArrayList<Integer>(); //valido, tipo redundante
        //List<Number> list3 = new ArrayList<Integer>(); //no valido
        List list4 = new ArrayList<Integer>(); //valido
        //List<? extends Number> list5 = new ArrayList<? extends Number>(); //no valido, ? extends Class es para declaraciones
        List<?> list6 = new ArrayList(); //valido(?
    }
}
