package osa3_2.Task4.Task1;


public class Car extends AbstractVehicle {

//    //Implementing the vehicle interface//
//    private String type;
//    private String fuel;
//    private String color;

    public Car(String type, String fuel, String color, double fuelEfficiency) {
        super(type, fuel, color, fuelEfficiency);
    }

    @Override
    public void start() {
        System.out.println("Car is starting");

    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }

    @Override
    public String getInfo() {
        return "Type:" + type + " Fuel: " + fuel + " Color:" + color;
    }

}

