package osa1_1;/* Task3
Lets make some modifying on to the code/*
I changed the name on the class I added here the name of the task SumOfThreeNumbers
 */

import java.util.Scanner;



    public class Task1_3 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.println("Give the first number:");
            int first = Integer.parseInt(scanner.nextLine());

            System.out.println("Give the second number:");
            int second = Integer.parseInt(scanner.nextLine());

            System.out.println("Give the third number:");
            int third = Integer.parseInt(scanner.nextLine());

            // Let's make two new calculating methods //

            // I did make a product method and added the three numbers and multiply the integers //
            int product = first * second * third;

            //Let's make A average method and adding remainder tho the average double is decimal command//
            double average = (first + second + third) / 3.0;


            System.out.println("The sum of the numbers is " + (first + second + third));
            System.out.println("The product of the number is " + product);
            System.out.println("The average of the number is " + average);
        }
    }

