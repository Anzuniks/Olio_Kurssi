//Module 2 from 2.1 Task 2//

package osa3_1.Task1;


public class Task1 {
    public static void main(String[] args) {

        Car toyota = new Car("Toyota", 60, 0);
        toyota.fillTank();
        toyota.accelerate();
        System.out.println("Toyota speed: " + toyota.getSpeed());


        SportsCar ferrari = new SportsCar("Ferrari", 50, 0);
        ferrari.fillTank();
        ferrari.accelerate();
        System.out.println("Ferrari speed: " + ferrari.getSpeed());


    }
}

