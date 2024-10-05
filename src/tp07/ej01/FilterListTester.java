package tp07.ej01;

import java.util.List;

public class FilterListTester {
    public static void main(String[] args) {
        FilterList<String> list = new ArrayFilterList<>();
        list.add("abba");
        list.add("pepe");
        list.add("mama");
        list.add("ana");
        list.add("abril");
        List<String> filter = list.filter(str -> str.startsWith("a"));
        System.out.println(filter);
    }
}
