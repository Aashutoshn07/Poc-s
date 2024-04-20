package Problem_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SumOfArrayWithThread {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int numThreads = 4;
        int segmentSize = array.length / numThreads;

        ExecutorService executorService = Executors.newFixedThreadPool(numThreads);

        SumOfArray[] calculators = new SumOfArray[numThreads];
        for (int i = 0; i < numThreads; i++) {
            int start = i * segmentSize;
            int end = (i == numThreads - 1) ? array.length : (i + 1) * segmentSize;
            calculators[i] = new SumOfArray(array, start, end);
            executorService.execute(calculators[i]);
        }
        executorService.shutdown();
        try {
            executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        long totalSum = 0;
        for (SumOfArray calculator : calculators) {
            totalSum += calculator.getPartialSum();
        }
        System.out.println("Total Sum: " + totalSum);
    }
}
