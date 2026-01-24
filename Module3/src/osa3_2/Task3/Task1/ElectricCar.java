package osa3_2.Task3.Task1;

public class ElectricCar extends AbstractVehicle {

    public ElectricCar(String type, String fuel, String color) {
        super("Electric Car", "Electric", color);
    }

    @Override
    public void charge() {
        System.out.println(type + " is charging battery..");
    }
}
