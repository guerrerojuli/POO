package parcial02.c12024.ej02;

import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import java.time.YearMonth;
import java.util.Set;

public class ReimbursementTracker {
    private final Map<String, Integer> clientsCap = new HashMap<>();
    private final Map<String, Map<YearMonth, Integer>> clients = new HashMap<>();

    private void checkIfClientExists(String client) {
        if (!clients.containsKey(client))
            throw new RuntimeException("Client is not registered");
    }

    public void registerClient(String client, int amount) {
        if (clientsCap.containsKey(client))
            throw new RuntimeException("Client already registered");
        clientsCap.put(client, amount);
        clients.put(client, new HashMap<>());
    }

    public int getRemainingReimbursement(String client, YearMonth yearMonth) {
        checkIfClientExists(client);
        clients.get(client).putIfAbsent(yearMonth, clientsCap.get(client));
        return clients.get(client).get(yearMonth);
    }

    public void addReimbursement(String client, YearMonth yearMonth, int amount) {
        checkIfClientExists(client);
        clients.get(client).putIfAbsent(yearMonth, clientsCap.get(client));
        int reimbursement = clients.get(client).get(yearMonth);
        if (reimbursement < amount) {
            throw new RuntimeException("Reimbursement surpasses month cap");
        }
        clients.get(client).put(yearMonth, reimbursement - amount);
    }

    public Set<Map.Entry<YearMonth, Integer>> getReimbursements(String client, YearMonth yearMonthStart, YearMonth yearMonthEnd) {
        checkIfClientExists(client);
        return clients.get(client).entrySet();
    }
}
