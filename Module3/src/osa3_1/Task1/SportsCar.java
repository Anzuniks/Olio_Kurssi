package osa3_1.Task1;

public class SportsCar extends Car {

    public SportsCar(String typeName, double tankCapacity, double topSpeed) {
        super(typeName, tankCapacity, topSpeed);
    }

    @Override
    public void accelerate() {
    if (gasolineLevel > 0) {
        speed += 50;
        gasolineLevel -= 5;
        System.out.println(typeName + " Wooooooshh! Speed " + speed);
    } else {
        System.out.println("Im out gas!");
        }
    }

    @Override
    void decelerate(int amount) {
        if (getSpeed() > 0) {

            speed = Math.max(0, speed - (amount * 2));
            System.out.println(getTypeName() + "(Sport): Hard breaking! Speed is" + getSpeed());
        }
    }
}
