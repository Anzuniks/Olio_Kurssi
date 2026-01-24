package osa3_1.Task2;

import osa3_1.Task1.Car;
import osa3_1.Task1.SportsCar;

public class Task2 {

        public static void main(String[] args) {

        Car myCar = new Car("Toyota", 60, 20);
        myCar.fillTank();

        SportsCar ferrari = new SportsCar("Ferrari", 100.0, 0);
        ferrari.fillTank();
        ferrari.accelerate();


        System.out.println("\n--- Testing Bus ----");
        Bus onnibus = new Bus("Onnibus", 200, 0);
        onnibus.fillTank();

        onnibus.passengerEnter();
        onnibus.passengerEnter();

        onnibus.accelerate();
        System.out.println("Bus speed " + onnibus.getSpeed());

        onnibus.passengerExit();

    }
}
