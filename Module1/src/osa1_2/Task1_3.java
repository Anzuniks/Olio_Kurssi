//Task3 from 1.2//

package osa1_2;

import java.util.Scanner;

public class Task1_3 {
    //Lets make three leiviska and naula and luoti//
    public static void main (String [] args) {
        //Let's ask the user weight in grams //
        Scanner scanner = new Scanner(System.in);

        //I am going to do input statements for leiviska and naula, luoti//
        System.out.print("Enter weight in grams: ");
        double grams = scanner.nextDouble();



        //I made the integers values for leiviska, naula and luotin//
        int leiviska = 20;
        int naula = 32;
        double luoti = 13.28;

        //Now we make the calculation//
        //First we convert grams to leiviska//
        int totalleiviska = (int)  (grams / (leiviska * naula * luoti));
        //Then we convert grams to naula//
        int totalnaula = (int) ((grams / (naula * luoti)) % leiviska);
        //Then we convert grams to luoti//
        double totalluoti = (grams / luoti) % naula;
        //Now we print the results//
        System.out.printf("%.0f grams is %d, leiviskä, %d, naula, %.2f luoti.\n", grams, totalleiviska, totalnaula, totalluoti);


    }
}
