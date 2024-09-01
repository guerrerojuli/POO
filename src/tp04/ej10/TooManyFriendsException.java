package tp04.ej10;

public class TooManyFriendsException extends FriendException {
    public TooManyFriendsException(String number) {
        super(number, "Too many friends");
    }
}
