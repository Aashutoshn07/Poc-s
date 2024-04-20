package Problem_3;

import java.math.BigInteger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FactorialThreads {
    public static void main(String[] args) {
        int number = 10;
        int numThreads = 4;

        ExecutorService executor = Executors.newFixedThreadPool(numThreads);

        FactorialCal[] calculators = new FactorialCal[numThreads];
        int segmentSize = number / numThreads;

        for(int i=0; i<numThreads;i++){
            int start = i * segmentSize + 1;
            int end = (i == numThreads -1) ? number :(i + 1) *segmentSize;
            calculators[i] = new FactorialCal(start, end);
            executor.execute(calculators[i]);
        }
        executor.shutdown();

        try{
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        BigInteger totalFaclorial = BigInteger.ONE;
        for(FactorialCal cal : calculators){
            totalFaclorial = totalFaclorial.multiply(cal.getPartialFactorial());
        }
        System.out.println("Factorial of"+ number + " is: "+totalFaclorial);
    }
}
