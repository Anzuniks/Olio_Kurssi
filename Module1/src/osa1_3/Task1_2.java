//Task 2 from module 1.3//

package osa1_3;

import java.util.Scanner;

public class Task1_2 {
    public static void main (String [] args) {
        //Let's do prompt for the user to enter a binary number//

        //First we need the scanner
        Scanner scanner = new Scanner(System.in);

        //Now we make the prompt//
        System.out.println("Enter a binary number:");
        //Now we read the input//
        String binaryString = scanner.nextLine();

        //Now we make decimal value//

        int decimalValue = 0;

        //Now we do if statements to convert binary to decimal//
        for (int i = 0; i < binaryString.length(); i++) {
            //First we get the character at position i//
            char bitChar = binaryString.charAt(i);

            //Now we are going to check if the character is 1 or 0//
            int bitValue = (bitChar ==  '1') ? 1 : 0;

            //Next we calculate the power of 2 based on the position//
            decimalValue = (decimalValue * 2) + bitValue;
        }

        //Print the decimal value//
        System.out.println("Decimal value: " + decimalValue);
    }
}
