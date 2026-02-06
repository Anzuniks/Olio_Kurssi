package osa5_1.Task2;


class SumThread extends Thread {
    private int[] arr;
    private int start, end;
    private long partialSum;

    public SumThread(int[] arr, int start, int end) {
        this.arr = arr;
        this.start = start;
        this.end = end;
        this.partialSum = 0;
    }

    public long getPartialSum() {
        return partialSum;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            partialSum += arr[i];
        }
    }
}
