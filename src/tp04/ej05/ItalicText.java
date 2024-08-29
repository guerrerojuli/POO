package tp04.ej05;

public class ItalicText extends FormatText {
    private static String FORMAT = "i";

    public ItalicText(HTMLText text) {
        super(text, FORMAT);
    }
}
