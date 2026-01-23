//Task 3 Module 1.4//

package osa1_4.Task3;

import java.util.HashSet;
import java.util.Scanner;

public class Task1_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the integers into the array: ");
        for (int i = 0; i < size; i++) {
            System.out.println("Enter integer " + (i + 1) + "\n: ");
            numbers[i] = scanner.nextInt();
        }

        int newSize = removeDuplicates(numbers);




        //Lets create a duplicate to remove dublicates//
        System.out.println("\nThe array with duplicates: ");
        for (int i = 0; i < newSize; i++) {
            System.out.print(numbers[i] + " ");
        }

    }

        static int removeDuplicates(int[] arr) {
            HashSet<Integer> s = new HashSet<>();
            int idx = 0;
            for (int i = 0; i < arr.length; i++) {
                if (!s.contains(arr[i])) {
                    s.add(arr[i]);
                    arr[idx++] = arr[i];
                }
            }

            return idx;
        }
    }

