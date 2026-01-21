//Module 2 from 2.1 Task 2//

package Osa2_1;


/* Define a class CarNew (convention capitalizes class names).
 * CarNew is public (as classes usually are, more on this later).
 */
    class Car {
    /* An object of class CarNew will have instance variables speed and gasolineLevel.
     * Both are private (they can not be accessed outside the class methods).
     * Keep instance variables private whenever possible.
     */
    private double speed;
    private double gasolineLevel;
    private String typeName;
    private double tankCapacity;

    /* This is the method (constructor) called when a new instance of CarNew is created (with new).
     * Constructors may also have arguments.
     */
    public Car(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
        tankCapacity = 100;
        // this refers to the object itself.
        // The reference is useful if you want to use parameter names that are
        // identical to instance variable names (and for more, later on)
    }

    //New constructor//
    public Car(String typeName, double tankCapacity, double speed) {
    this.typeName = typeName;
    this.tankCapacity = tankCapacity;
    this.speed = speed;
    this.gasolineLevel = 0;
    }



    /* Implementations of some methods.
     * Note that methods refer to and change instance variable values.
     */
    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }
    void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }
    double getSpeed() {
        return speed;
    }
    String getTypeName() {
        return typeName;
    }
    void fillTank() {
        gasolineLevel = this.tankCapacity;
    }
    double getGasolineLevel() {
        return gasolineLevel;
    }


}

public class Task2_2 {
    public static void main(String[] args) {
        Osa2_1.CarNew myCarNew;

        myCarNew = new Osa2_1.CarNew("Toyota Corolla", 60.0, 20.0);
        myCarNew.fillTank();
        System.out.println("Tanked to: " + myCarNew.getGasolineLevel() + " liters");

        for (int i = 0; i < 6; i++) {
            myCarNew.accelerate();
            System.out.println(myCarNew.getTypeName() + ": speed is " + myCarNew.getSpeed() + " km/h");
        }

        while (myCarNew.getSpeed() > 0) {
            myCarNew.decelerate(15);
            System.out.println(myCarNew.getTypeName() + ": speed is " + myCarNew.getSpeed() + " km/h");
        }
    }
}
