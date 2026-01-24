package osa3_2.Task4.Task1;


//Implementing the Vehicle//
    public class Bus extends AbstractVehicle {

        public int capacity;

        public Bus(String type, String fuel, String color,  int capacity, double fuelEfficiency) {
            super(type, fuel, color, fuelEfficiency);
            this.capacity = capacity;
        }
        @Override
        public String getInfo() {
            return super.getInfo() + "\nCapacity: " + capacity + " passengers";
        }
    }