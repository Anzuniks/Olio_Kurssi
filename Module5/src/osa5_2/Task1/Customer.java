package osa5_2.Task1;

     class Customer  implements Runnable {
         private TicketReservation system;
         private int requestedSeats;
         private int id;

         public Customer(TicketReservation system, int id, int reguestedSeats) {
             this.system = system;
             this.id = id;
             this.requestedSeats = reguestedSeats;
         }

         @Override
         public void run() {
             if (system.reserveSeats(requestedSeats)) {
                 System.out.println("Customer " + id + " reserved " + requestedSeats + " tickets");
             } else {
                 System.out.println("Customer " + id + " failed to reserve " + requestedSeats + " tickets");
             }
         }
     }
