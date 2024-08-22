package tp02.ej05;

public class Palindromo {
    public static void main(String[] args) {
        StringBuilder phrase = new StringBuilder();
        for (String arg: args) {
            phrase.append(arg.toLowerCase());
        }
        String string = phrase.toString();
        String reversedString = phrase.reverse().toString();
        System.out.println(((string.equals(reversedString)) ? "" : "NO ") + "ES PALINDROMO");
    }
}
