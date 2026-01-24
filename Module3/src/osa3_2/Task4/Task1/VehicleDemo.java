package osa3_2.Task4.Task1;

public class VehicleDemo {
    public static void main(String [] args) {


        System.out.println("\n ----- Car ----");
        AbstractVehicle normalCar = new Car("Hatchback ", "Petrol ", "Blue ", 15.0);

        AbstractVehicle tesla = new ElectricCar("Tesla Model 3 ", "Electric", "Yellow", 20.0);


        normalCar.charge();
        tesla.charge();

        System.out.println("Normal Car Efficiency: " + normalCar.getFuelEfficiency() + " l/100km");
        System.out.println("Tesla Efficiency: " + tesla.getFuelEfficiency() + " kWh/100km");

//        Vehicle car = new Car("Sedan", "Petrol", "Red", 4);
//        car.start();
//        car.stop();
//        System.out.println(car.getInfo());
//
//
//        System.out.println("\n ----- Motorcycle ----");
//        Motorcycle motorcycle = new Motorcycle("Motorcycle", "Gasoline", "Black");
//        motorcycle.start();
//        motorcycle.stop();
//        System.out.println(motorcycle.getInfo());
//
//
//
//        System.out.println("\n ----- Bus ----");
//        Vehicle bus = new Bus("Bus", "Diesel", "Yellow", 50);
//        bus.start();
//        bus.stop();
//        System.out.println(bus.getInfo());

//        System.out.println("\n ----- Electric Car ----");
//        AbstractVehicle normalCar = new Car("Hatchback: ", "Petrol", "Blue");
//        AbstractVehicle tesla = new ElectricCar("Tesla Model 3", "Electric", "White");
//
//        normalCar.charge();
//        tesla.charge();




    }
}
