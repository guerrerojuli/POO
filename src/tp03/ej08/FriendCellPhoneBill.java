package tp03.ej08;

import java.util.Arrays;

public class FriendCellPhoneBill extends CellPhoneBill
{
  private String[] friends;
  private int friendsIndex;
  private int friendsLimit;
  private double cost;

  private double DEFAULT_FRIEND_COST_PER_SECOND = 0;

  FriendCellPhoneBill(String number, int limit) {
      super(number);
      friends = new String[limit];
      friendsLimit = limit;
      this.cost = DEFAULT_FRIEND_COST_PER_SECOND;
  }

  public void setCost(double cost) {
    this.cost = cost;
  }

  public void addFriend(String number) {
      if (friendsIndex < friendsLimit && !containsFriend(number)) {
          friends[friendsIndex++] = number;
      }
  }

  private boolean containsFriend(String number) {
      for(int i = 0; i < friendsIndex; i++) {
          if (friends[i].compareTo(number) == 0) {
              return true;
          }
      }
      return false;
  }

  public void removeFriend(String number) {
      boolean found = false;
      for (int i = 0; i < friendsIndex && !found; i++) {
          if (friends[i].compareTo(number) == 0) {
              friends[i] = friends[--friendsIndex];
              found = true;
          }
      }
  }

  @Override
  public double processBill() {
      double total = 0;
      for (int i = 0; i < callsIndex; i++) {
          if (containsFriend(calls[i].getTo())) {
             total += calls[i].getCost() * cost;
          } else {
              total += calls[i].getCost();
          }
      }
      return total;
  }
}
