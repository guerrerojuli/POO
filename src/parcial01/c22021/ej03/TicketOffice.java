package parcial01.c22021.ej03;

public class TicketOffice {
    public Ticket buySkiTicket(int rides) {
        return new Ticket(true, rides);
    }

    public Ticket buyVisitorTicket(int rides) {
        return new Ticket(false, rides);
    }

    public void ride(Ticket ticket, Chairlift chairlift) {
        if (!chairlift.allowed(ticket)) throw new RuntimeException("Invalid chairlift for ticket");
        ticket.useRide();
    }
}
