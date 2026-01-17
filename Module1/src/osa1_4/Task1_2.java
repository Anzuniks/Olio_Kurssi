//Task 2 Module 1.4//

package osa1_4;

import java.util.Scanner;

public class Task1_2 {
    public static void main(String[] args) {
        //Lets ask the user for numbers integers as array
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();



        //Lets add printIn Enter the into the array//
        int[] numbers = new int[size];

        System.out.println("Enter the integers into the array: ");
        //I am going to add loop to iterate through the arrays//
        for (int i = 0; i < size; i++) {
            System.out.println("Enter integer: " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        //We need to get maximum value from the array//
        int maxSum = Integer.MIN_VALUE;
        int max = 0;
        int min = 0;

        //Creting loop from max and min//
        for (int i = 0; i < size; i++) {

            for (int j = i; j < size; j++) {
                int currentSum = 0;

                for (int k = i; k <= j; k++) {
                    currentSum += numbers[k];
                }

                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    max = i + 1;
                    min = j + 1;
                }
            }
        }

        System.out.println("\nMaximum sum: " + maxSum);
        System.out.println("Integers: " + max + "-" + min);

    }
}
