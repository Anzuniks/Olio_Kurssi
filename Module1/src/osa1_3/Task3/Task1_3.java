//Task 3 from 1.3 module//

package osa1_3.Task3;

import java.util.Scanner;

public class Task1_3 {
    //Lets make prime generator number//

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        //Prompt the user for start input for positive number//
        System.out.print("Enter a positive integer: ");
        int start = scanner.nextInt();

        // Now we need the second positive number to the end//
        System.out.println("Enter another positive integer greater than the first: ");
        int end = scanner.nextInt();

        //Now i am going to make a for loop for this prime generator//
        System.out.println("Prime numbers between " + start + " and " + end + " are " );

        //Loop n to m//
        for (int i = start; i <= end; i++) {
            //Checking if the number is prime//
            if (i < 2) continue;

            //Boolean variable to check if i is prime//
            boolean isPrime = true;

            //another loop to//
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }

            }

            if (isPrime) {
                System.out.print(i + " ");

            }

        }
        System.out.println();
    }
}
