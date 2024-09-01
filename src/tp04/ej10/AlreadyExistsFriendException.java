package tp04.ej10;

public class AlreadyExistsFriendException extends FriendException {
    public AlreadyExistsFriendException(String number) {
        super(number, "Friend already exists");
    }
}
