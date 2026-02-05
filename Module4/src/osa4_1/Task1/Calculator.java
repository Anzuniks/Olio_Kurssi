package osa4_1.Task1;

public class Calculator {
    private int value = 0;


    //Method that returns the current value//
    public int getValue() {
        return value;
    }

    //Method that resets the value to zero//
    public void reset() {
        value = 0;
    }

    //Importan method that adds a number and checks the negativity//
    public void add(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("Only positive numbers are allowed");
        }
        this.value += number;
    }
}




