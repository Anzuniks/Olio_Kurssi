package osa3_1.Task3;

public class ShapeCalculator {
    public static void main(String [] args) {

        System.out.println("--- Shape Calculator ---");

        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Triangle(3.0, 7.0);

        for (Shape s : shapes) {
            System.out.println("Shape:" + s.getClass().getSimpleName());
            System.out.println("Area: " + s.calculateArea());
            System.out.println("-");
        }
    }
}
