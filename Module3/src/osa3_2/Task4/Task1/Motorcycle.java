package osa3_2.Task4.Task1;

public class Motorcycle extends AbstractVehicle {

    public Motorcycle(String type, String fuel, String color, double fuelEfficiency) {
        super(type, fuel, color, fuelEfficiency);
    }


    @Override
    public void start() {
        System.out.println(type + ": Motorcycle engine is starting with a vroom!");
    }
}