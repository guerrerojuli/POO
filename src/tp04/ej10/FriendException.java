package tp04.ej10;

public class FriendException extends Exception {
    public FriendException(String number, String message) {
        super("Error for number " + number + ": " + message);
    }
}
