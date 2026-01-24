package osa3_2.Task4.Task1;

public class ElectricCar extends AbstractVehicle {

    public ElectricCar(String type, String fuel, String color, double fuelEfficiency) {
        super("Electric Car", "Electric", color, fuelEfficiency);
    }

    @Override
    public void charge() {
        System.out.println(type + " is charging battery..");
    }
}
