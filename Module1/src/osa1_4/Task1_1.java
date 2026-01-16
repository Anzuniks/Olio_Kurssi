//Task1 from module 1.4//

package osa1_4;

import java.util.Scanner;
import java.util.Random;


public class Task1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Lets creating a name generator//
        System.out.println("How many names do you want to generate?: ");
        //Input number of names to generate//
        int numberOfNames = scanner.nextInt();
        scanner.nextLine(); // New line character consumption

        //Strings for name generation//

        String[] firstNames = {"Eerika", "Matti", "Jarkko", "Liisa", "Kalle", "Anna", "Pekka", "Sari"};
        String[] lastNames = {"Korhonen", "Virtanen", "Mäkinen", "Nieminen", "Kemppainen"};


        //Random generator//
        Random random = new Random();

        //Generating names//
        for (int i = 0; i < numberOfNames; i++) {
            String firstName = firstNames[random.nextInt(firstNames.length)];
            String lastName = lastNames[random.nextInt(lastNames.length)];
            String fullname = firstName + " " + lastName;
            System.out.println("Generated name:" + fullname);

        }
        scanner.close();
    }
}
