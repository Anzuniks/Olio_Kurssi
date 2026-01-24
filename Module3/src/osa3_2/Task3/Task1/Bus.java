package osa3_2.Task3.Task1;


//Implementing the Vehicle//
    public class Bus extends AbstractVehicle {

        public int capacity;

        public Bus(String type, String fuel, String color,  int capacity) {
            super(type, fuel, color);
            this.capacity = capacity;
        }
        @Override
        public String getInfo() {
            return super.getInfo() + "\nCapacity: " + capacity + " passengers";
        }
    }