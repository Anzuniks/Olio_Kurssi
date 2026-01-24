package osa3_2.Task2.Task1;

public class Motorcycle extends AbstractVehicle {

    public Motorcycle(String type, String fuel, String color) {
        super(type, fuel, color);
    }


    @Override
    public void start() {
        System.out.println(type + ": Motorcycle engine is starting with a vroom!");
    }
}