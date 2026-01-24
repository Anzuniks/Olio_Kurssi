package osa3_1.Task1;

public class Car {

    protected double speed;
    protected double gasolineLevel;
    protected String typeName;
    protected double tankCapacity;

    /* This is the method (constructor) called when a new instance of CarNew is created (with new).
     * Constructors may also have arguments.
     */
    public Car(String typeName) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;
        tankCapacity = 100;

    }

    //New constructor//
    public Car(String typeName, double tankCapacity, double speed) {
        this.typeName = typeName;
        this.tankCapacity = tankCapacity;
        this.speed = speed;
        this.gasolineLevel = 0;
    }




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
    public double getSpeed() {
        return speed;
    }
    public String getTypeName() {
        return typeName;
    }
    public void fillTank() {
        gasolineLevel = this.tankCapacity;
    }
    public double getGasolineLevel() {
        return gasolineLevel;
    }


}
