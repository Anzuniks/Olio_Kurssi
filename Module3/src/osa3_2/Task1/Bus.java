package osa3_2.Task1;



    //Implementing the Vehicle//
    public class Bus implements Vehicle {

        //Implementing the vehicle interface//
        private String type;
        private String fuel;
        private int capacity;

        public Bus(String type, String fuel, int capacity) {
            this.type = type;
            this.fuel = fuel;
            this.capacity = capacity;
        }

        @Override
        public void start() {
            System.out.println("Bus is starting");

        }

        @Override
        public void stop() {
            System.out.println("Bus is stopping...");
        }

        @Override
        public String getInfo() {
            return "Type:" + type + " Fuel: " + fuel + " Capacity: " + capacity + " passengers";
        }

    }
