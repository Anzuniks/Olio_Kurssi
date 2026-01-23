/* Lets make fahreneit and celsius convererter  Task1 from 1.2*/

package osa1_2.Task1;

import java.util.Scanner;

public class Task1_1 {
    public static void main(String [] args) {
        //Let' make input scanner//
        Scanner input = new Scanner(System.in);

        //Let's make the prompt for user to enter the temperature Fahrenheit and converts to celsius input//
        System.out.print("Enter temperature in Fahrenheit:");
        double fahrenheit = input.nextDouble();

        //Then lets make variable to convertion//
        double celsius = (fahrenheit - 32) * 5 / 9.0;
        //And then we print the result//
        System.out.println(fahrenheit + " Fahreiheit is equal to " + celsius + " in Celsius ");

    }
}
