package tp04.ej05;

public class PlainText implements HTMLText {
    private String text;

    public PlainText(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String source() {
        return text;
    }

    @Override
    public String toString() {
        return source();
    }
}
