package parcial02.c22023.ej01;

import java.util.HashMap;
import java.util.Map;
import java.util.function.UnaryOperator;

public class RouteCentral {
    private final Map<String, Map<String, Integer>> route = new HashMap<>();
    private final UnaryOperator<Integer> twoWayCost;

    public RouteCentral(UnaryOperator<Integer> twoWayCost) {
        this.twoWayCost = twoWayCost;
    }

    private void checkRoute(String from, String to) {
        if (!route.containsKey(from) || !route.get(from).containsKey(to))
            throw new RuntimeException("Route does not exist");
    }

    public void addOneWayRoute(String from, String to, int cost) {
        route.putIfAbsent(from, new HashMap<>());
        route.get(from).putIfAbsent(to, cost);
    }

    public void addTwoWayRoute(String from, String to, int cost) {
        int finalCost = twoWayCost.apply(cost);
        addOneWayRoute(from, to, finalCost);
        addOneWayRoute(to, from, finalCost);
    }

    public int getDirectRouteMiles(String from, String to) {
        checkRoute(from, to);
        return route.get(from).get(to);
    }

    public int getOneStopRouteMiles(String from, String stop, String to) {
        return getDirectRouteMiles(from, stop) + getDirectRouteMiles(stop, to);
    }

    public void changeRouteCost(String from, String to, int cost) {
        checkRoute(from, to);
        route.get(from).put(to, cost);
    }
}
