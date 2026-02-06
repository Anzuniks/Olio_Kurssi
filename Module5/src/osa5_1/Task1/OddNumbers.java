package osa5_1.Task1;

public class OddNumbers implements Runnable {
    //This class will print odd numbers from 0 to 100//
    public void run() {
        for (int i = 0; i <= 19; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd Thread: " + i);
            }
            if (i == 1) {

                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    System.out.println("Odd Thread Interrupted");
                    return;
                }
            }
        }
    }
}
