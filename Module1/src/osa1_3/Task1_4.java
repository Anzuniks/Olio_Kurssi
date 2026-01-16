//Task4 from module 1.3//

package osa1_3;

import java.util.Scanner;

public class Task1_4 {
    //Let's make a multiplacation exam table for elementary school students//

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);


        //Lets do the input for the multiplication table size//
        System.out.println("Enter the size of the multiplication table size:");
        int size = scanner.nextInt();

        //Next i am going to add the multiplication table//
        System.out.println("Multiplication table of size" + size + ":");


        int points; //Points variable to count correct answers//


        //Do while loop//
        do {

            points = 0; //To reset points after each round//

            //For loop//
            for (int i = 1; i <= 10; i++) {
                //Lets add math.random for the multiplication//
                int num1 = (int)(Math.random() * size) + 1;
                int num2 = (int)(Math.random() * size) + 1;

                //Print the question//
                System.out.println("What is " + num1 + " x " + num2 + " ? ");
                int answer = scanner.nextInt();

                //Check the answers//

                if (answer == num1 * num2) {
                    System.out.println("Correct!");
                    points++;
                }  else {
                    System.out.println("Incorrect. The correct answer is " + (num1 * num2));

                }
            }

        } while (points < 10); //End of do while loop//
        System.out.println("Congrats!" + " You have answered " + points + "questions correctly.");
    }
}
