package osa3_1.Task4.Task3;

public class Circle extends Shape {
    private double radius;


    public Circle(double radius, String color) {
        super(color);
        this.radius = radius;

    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
