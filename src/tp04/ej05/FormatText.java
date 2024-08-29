package tp04.ej05;

public class FormatText implements HTMLText {
    private HTMLText text;
    private String format;
    private HTMLAttribute[] attributes;

    public FormatText(HTMLText text, String format, HTMLAttribute... attributes) {
        this.text = text;
        this.format = format;
        this.attributes = attributes;
    }

    @Override
    public String source() {
        StringBuilder source = new StringBuilder();
        source.append("<").append(format);
        for (HTMLAttribute attribute : attributes) {
            source.append(" ").append(attribute);
        }
        source.append(">").append(text.source()).append("</").append(format).append(">");
        return source.toString();
    }

    @Override
    public String toString() {
        return source();
    }
}
