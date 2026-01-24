package osa3_1.Task2;

import osa3_1.Task1.Car;
import osa3_1.Task1.SportsCar;

    public class Bus extends Car {

    private int passengers;


    public Bus(String typeName, double tankCapacity, double speed) {
        super(typeName, tankCapacity, speed);
        this.passengers = 0;
    }


    public void passengerEnter() {
        passengers++;
        System.out.println(getTypeName() + ":Passengers has entered to the bus " + passengers);
    }

    public void passengerExit() {
        if (passengers > 0) {
            passengers--;
            System.out.println(getTypeName() + ": Passengers has exited from the bus " + passengers);
        } else {
            System.out.println(getTypeName() + ": No passengers to exit.");
        }
    }
}

