package osa3_2.Task1;


import osa3_2.Task2.Task1.AbstractVehicle;

public class Car extends AbstractVehicle {
    public Car(String type, String fuel, String color) {
        super(type, fuel, color);
    }

    @Override
    public void start() {
        System.out.println("Car engine is roars to life!");
    }
}
