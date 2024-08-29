package tp04.ej05;


public class LinkText extends FormatText {
    private static String FORMAT = "a";

    public LinkText(HTMLText text, String href) {
        super(text, FORMAT, new HTMLAttribute("href", href));
    }
}
