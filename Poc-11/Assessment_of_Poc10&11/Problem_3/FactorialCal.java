package Problem_3;

import java.math.BigInteger;

public class FactorialCal implements Runnable {
    private int start;
    private int end;
    private BigInteger partialFactorial;

    public FactorialCal(int strat, int end) {
        this.start = strat;
        this.end = end;
    }

    public BigInteger getPartialFactorial() {
        return partialFactorial;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            partialFactorial = partialFactorial.multiply(BigInteger.valueOf(i));
        }
    }
}
