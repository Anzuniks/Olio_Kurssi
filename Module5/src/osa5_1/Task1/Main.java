package osa5_1.Task1;

public class Main {
    //Lets create a thread for odd and even numbers//
    public static void main(String [] args) {
         Thread even = new Thread(new EvenNumbers());
         Thread odd = new Thread(new OddNumbers());


         odd.start();
         try {
            Thread.sleep(10);
         } catch (InterruptedException e) {

         }

         even.start();

        try {
            even.join();
            odd.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }







        System.out.println("Printing complete");


    }
}
