package osa3_2.Task4.Task1;


public abstract class AbstractVehicle implements Vehicle, ElectricVehicle {

    protected String type;
    protected String fuel;
    protected String color;
    protected double fuelEfficiency;

    public AbstractVehicle(String type, String fuel, String color, double fuelEfficiency) {
        this.type = type;
        this.fuel = fuel;
        this.color = color;
        this.fuelEfficiency  = fuelEfficiency;
    }

    protected AbstractVehicle() {

    }


    @Override
    public double getFuelEfficiency() {
            return this.fuelEfficiency;
    }

    @Override
    public void start() {
        System.out.println(type + " is starting");
    }

    @Override
    public void stop() {
        System.out.println(type + " is stopping...");
    }

    @Override
    public String getInfo() {
        return "Type: " + type + "\nFuel:" + fuel + "\nColor: " + color;
    }

    @Override
    public void charge() {
        System.out.println(type + "Charging is not possible for this fuel type. ");
    }

}


