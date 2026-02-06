package osa5_2.Task1;

     class TicketReservation {
    //Lets do the ticket reservation system with customers//
    private int seats;

    public TicketReservation(int seats) {
        this.seats = seats;
    }
    //Synchronized method to reserve a seat/
    public synchronized boolean reserveSeats(int maara) {
        if (maara <= seats) {
            seats -= maara;
            return true;
        } else {
            return false;
        }
    }

}
