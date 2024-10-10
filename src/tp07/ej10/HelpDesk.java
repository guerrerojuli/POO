package tp07.ej10;

import java.util.*;

public class HelpDesk {
    private final Map<ClientType, Queue<HelpTicket>> ticketsQueues = new TreeMap<>(Comparator.reverseOrder());

    public HelpDesk openTicket(ClientType type, String name, String question) {
        ticketsQueues.putIfAbsent(type, new LinkedList<>());
        ticketsQueues.get(type).add(new HelpTicket(name, question));
        return this;
    }

    public HelpTicket getNextTicket() {
        for (Queue<HelpTicket> queue : ticketsQueues.values()) {
            if (!queue.isEmpty())   return queue.poll();
        }
        throw new NoSuchElementException();
    }

    public HelpTicket getNextTicket(ClientType type) {
        return ticketsQueues.getOrDefault(type, new LinkedList<>()).remove();
    }

    public boolean hasTickets() {
        for (Queue<HelpTicket> queue : ticketsQueues.values()) {
            if (!queue.isEmpty())   return true;
        }
        return false;
    }

    public static class HelpTicket {
        private final String name, question;

        public HelpTicket(String name, String question) {
            this.name = name;
            this.question = question;
        }

        @Override
        public String toString() {
            return String.format("HelpTicket for %s asking %s", name, question);
        }
    }
}
