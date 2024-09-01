package tp04.ej10;

public class FriendNotFoundException extends FriendException {
    public FriendNotFoundException(String number) {
        super(number, "Friend not found");
    }
}
