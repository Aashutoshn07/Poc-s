package Problem_5;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiPatterns {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        PrintPattern starPrinter = new PrintPattern("*", 5);
        PrintPattern numberPrinter = new PrintPattern("12345", 5);
        PrintPattern symbolPrinter = new PrintPattern("!@#$%", 5);

        executor.execute(starPrinter);
        executor.execute(numberPrinter);
        executor.execute(symbolPrinter);
        symbolPrinter.run();

        executor.shutdown();
    }
}
