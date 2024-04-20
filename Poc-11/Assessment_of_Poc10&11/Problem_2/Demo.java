package Problem_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class ArraySumCalculator implements Runnable {
    private int[] array;
    private int startIndex;
    private int endIndex;
    private long partialSum;

    public ArraySumCalculator(int[] array, int startIndex, int endIndex) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
        this.partialSum = 0;
    }

    public long getPartialSum() {
        return partialSum;
    }

    public void run() {
        for (int i = startIndex; i < endIndex; i++) {
            partialSum += array[i];
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int numThreads = 4;
        int segmentSize = array.length / numThreads;

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        ArraySumCalculator[] calculators = new ArraySumCalculator[numThreads];
        for (int i = 0; i < numThreads; i++) {
            int start = i * segmentSize;
            int end = (i == numThreads - 1) ? array.length : (i + 1) * segmentSize;
            calculators[i] = new ArraySumCalculator(array, start, end);
            executor.execute(calculators[i]);
        }

        executor.shutdown();

        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long totalSum = 0;
        for (ArraySumCalculator calculator : calculators) {
            totalSum += calculator.getPartialSum();
        }

        System.out.println("Total Sum: " + totalSum);
    }
}
