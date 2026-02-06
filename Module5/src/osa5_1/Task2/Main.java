package osa5_1.Task2;


public class Main {
    public static void main(String[] args) {
        // Create an array of 1000 integers
        int numCores = Runtime.getRuntime().availableProcessors();
        int arraySize = 1000000;
        int[] numbers = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            numbers[i] = (int) (Math.random() * 100);
        }

            SumThread[] threads = new SumThread[numCores];
            int chunkSize = arraySize / numCores;

            for (int i = 0; i < numCores; i++) {

                int start = i * chunkSize;
                int end = (i == numCores - 1) ? arraySize : (start + chunkSize);

                threads[i] = new SumThread(numbers, start, end);
                threads[i].start();
            }
                long totalSum = 0;
                try {
                    for (SumThread thread : threads) {
                        if (thread != null) {
                            thread.join();
                            totalSum += thread.getPartialSum();
                        }
                    }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                System.out.println("Total Sum: " + totalSum);
                }
            }