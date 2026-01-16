//Task 1 from module 1.3//

package osa1_3;

import java.util.Scanner;

public class Task1_1 {
    //Let's make user and quadratic equatio that prompts the user//
    public static void main (String [] args) {

    //Next is the input scanner//
        Scanner scanner = new Scanner(System.in);
        //Now lets make the prompt to the user to//
        System.out.print("Enter the value of a: ");
        double a = scanner.nextDouble();

        //Same to b//
        System.out.print("Enter the value of b: ");
        double b = scanner.nextDouble();

        //Same to c//
        System.out.print("Enter the value of c: ");
        double c = scanner.nextDouble();

        //Now we make the discriminant//
        double discriminant = b * b - 4 * a * c;

        //Let's do the if statements to find the root//
        if (discriminant > 0) {
            //I'am going to make two roots//
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            //I am going to print the two roots//
            System.out.printf("The eguation has two real roots: %.2f and %.2f\n", root1, root2);
            //if discrimant is zero lets add else if and else//
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.printf("The equation has one real root: %.2f\n", root);

        } else {
            System.out.println("No real roots");
        }
    }
}
