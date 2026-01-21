//Task 4 from module 2.1//



package Osa2_1;


/* Define a class CarNew (convention capitalizes class names).
 * CarNew is public (as classes usually are, more on this later).
 */

class CarNew {
    /* An object of class CarNew will have instance variables speed and gasolineLevel.
     * Both are private (they can not be accessed outside the class methods).
     * Keep instance variables private whenever possible.
     */
    private double speed;
    private double gasolineLevel;
    private final String typeName;
    private final double tankCapacity;
    double targetSpeed;


    private boolean cruiseControlOn = false;
    private final double MIN_SPEED = 30.0;
    private final double MAX_SPEED = 140.0;

    public void setTargetSpeed(double speed) {
        if (speed >= MIN_SPEED && speed <= MAX_SPEED) {
            this.targetSpeed = speed;
        } else {
            System.out.println("Invalid target speed!");
        }
    }

    public double getTargetSpeed() {
        return this.targetSpeed;
    }


    public boolean turnOnCruiseControl() {
        if (this.gasolineLevel <= 0 || this.targetSpeed < MIN_SPEED) {
            this.cruiseControlOn = false;
            return false;
        }

        this.cruiseControlOn = true;


        while (this.cruiseControlOn && this.speed != this.targetSpeed) {
            if (this.speed < this.targetSpeed) {
                accelerate();

                this.gasolineLevel -= 0.5; //
            } else if (this.speed > this.targetSpeed) {
                decelerate(10);
            }


            if (this.gasolineLevel <= 0 && this.speed < this.targetSpeed) {
                this.cruiseControlOn = false;
                return false;
            }

            if (Math.abs(this.speed - this.targetSpeed) < 10) {
                this.speed = this.targetSpeed;
            }
            System.out.println("Adjusting speed... Current:" + this.speed + " km/h ");
        }


        return this.cruiseControlOn;
    }







    /* This is the method (constructor) called when a new instance of CarNew is created (with new).
     * Constructors may also have arguments.
     */


    //New constructor//
    public CarNew(String typeName, double tankCapacity, double speed) {
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

public class Task2_4 {
    public static void main(String[] args) {
        CarNew myCarNew = new CarNew("Toyota Corolla", 60.0, 20.0);
        myCarNew.fillTank();

        double target = 80.0;
        myCarNew.setTargetSpeed(target);
        System.out.println("Target speed set to:" + myCarNew.getTargetSpeed() + " km/h");

        System.out.println("Turning the cruise control on.");
        if (myCarNew.turnOnCruiseControl()) {
            System.out.println("Cruise control is now ON");
        } else {
            System.out.println("Failed to turn on cruise control!");
        }

        System.out.println("Current speed: after cruise control " + myCarNew.getSpeed() + " km/h ");

    }
}
