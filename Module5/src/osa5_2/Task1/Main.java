package osa5_2.Task1;

public class Main {
    public static void main(String [] args) {
        TicketReservation system = new TicketReservation(10);

        for (int i = 1; i <= 15; i++) {

            int seatsToReserve = (int) (Math.random() * 4) + 1;

            Thread customerThread = new Thread(new Customer(system, i, seatsToReserve));

            customerThread.start();
        }
    }
}
