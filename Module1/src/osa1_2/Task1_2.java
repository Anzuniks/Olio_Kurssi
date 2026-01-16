//Task 2 from 1.2//
package osa1_2;

import java.util.Scanner;

public class Task1_2 {
    //Let's make a program that asks the user for the lenghts of a right triangle

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);


        //I am gonna make print statements to ask the user for the lengths of the triangle
        System.out.print("Enter the length of side a: ");
        double a = scanner.nextDouble();


        //Now for side b
        System.out.print("Enter the length of side b: ");
        double b = scanner.nextDouble();

        //Now i am gonna make a hypotenuse for the triangle using the pythagora theory
        double c = Math.sqrt(a * a + b * b);
        System.out.printf("The length of the hypotenuse c is:  %.1f\n", c);

    }
}
