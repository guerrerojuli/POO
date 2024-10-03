package tp06.ej09;

import java.util.*;
import java.time.LocalTime;

public class TimeSetImpl<T> implements TimeSet<T> {
    private final Map<T, LocalTime> timeSet = new HashMap<>();

    public void add(T elem, int hours, int minutes) {
        timeSet.put(elem, LocalTime.of(hours, minutes));
    }

   public void remove(T elem) {
        timeSet.remove(elem);
   }

   public int size() {
        return timeSet.size();
   }

   public boolean contains(T elem) {
        return timeSet.containsKey(elem);
   }

   public Set<T> retrieve(int hoursFrom, int minutesFrom, int hoursTo, int minutesTo) {
        Set<T> ret = new HashSet<>();
        LocalTime from = LocalTime.of(hoursFrom, minutesFrom);
        LocalTime to = LocalTime.of(hoursTo, minutesTo);
        for (Map.Entry<T, LocalTime> entry : timeSet.entrySet()) {
            LocalTime time = entry.getValue();
            if (!time.isBefore(from) && !time.isAfter(to)) {
                ret.add(entry.getKey());
            }
        }
        return ret;
   }
}
