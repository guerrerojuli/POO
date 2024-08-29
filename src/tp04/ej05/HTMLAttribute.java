package tp04.ej05;

public class HTMLAttribute {
    private String key;
    private String value;

    public HTMLAttribute(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return key + ":" + value;
    }
}
