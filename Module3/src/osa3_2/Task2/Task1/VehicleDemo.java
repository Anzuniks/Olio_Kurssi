package osa3_2.Task2.Task1;

public class VehicleDemo {
    public static void main(String [] args) {



        Vehicle car = new Car("Sedan", "Petrol", "Red");
        car.start();
        car.stop();
        System.out.println(car.getInfo());


        System.out.println("\n ----- Motorcycle ----");
        Motorcycle motorcycle = new Motorcycle("Motorcycle", "Gasoline", "Black");
        motorcycle.start();
        motorcycle.stop();
        System.out.println(motorcycle.getInfo());



        System.out.println("\n ----- Bus ----");
        Vehicle bus = new Bus("Bus", "Diesel", "Yellow", 50);
        bus.start();
        bus.stop();
        System.out.println(bus.getInfo());


    }
}
