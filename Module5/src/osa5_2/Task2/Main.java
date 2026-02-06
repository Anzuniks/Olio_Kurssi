package osa5_2.Task2;

public class Main {
    //Lets call ThreadSafeList and add some elements to it with multiple threads//
    public static void main(String [] args) {
        ThreadSafeList list = new ThreadSafeList();
        int numberOfThreads = 10;
        Thread[] threads = new Thread[numberOfThreads];

        for (int i = 0; i < numberOfThreads; i++) {
            int threadId = i + 1;
            threads[i] = new Thread(() -> {
                list.addElement("Thread " + threadId + " - Data A");
                list.addElement("Thread " + threadId + " - Data B");
            });
            threads[i].start();
        }
        try {
            for (Thread t : threads) {
                if (t != null) {
                    t.join();
                }
            }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        System.out.println("Excpected size  " + (numberOfThreads * 2));
        System.out.println("Actual size  " + list.getSize());
    }
}
