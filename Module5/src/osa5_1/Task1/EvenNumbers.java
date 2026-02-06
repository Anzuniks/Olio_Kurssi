package osa5_1.Task1;

public class EvenNumbers implements Runnable {
    public void run() {
        for (int i = 2; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Thread: " + i);
            }
        }
    }
}
