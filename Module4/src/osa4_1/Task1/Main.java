package osa4_1.Task1;


public class Main {
    //Lets test our calulator//
    public static void main(String [] args) {
        Calculator calculator = new Calculator();
        calculator.add(5);
        calculator.add(10);
//      calculator.add(-5); //This should give an exception//

        System.out.println("Current value: " + calculator.getValue());

        calculator.reset();

        System.out.println("Value after reset: " + calculator.getValue());
    }
}
