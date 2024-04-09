import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random random = new Random();

        // Create a random double between 0.0 (inclusive) and 1.0 (exclusive)
        double randomDouble1 = random.nextDouble();
        System.out.println("Random Double 1: " + randomDouble1);

        // Create a random double between 0.0 (inclusive) and a specified upper bound
        double upperBound = 100.0;
        double randomDouble2 = random.nextDouble() * upperBound;
        System.out.println("Random Double 2 (0.0 to " + upperBound + "): " + randomDouble2);

        // Create a random double between a specified lower bound and upper bound
        double lowerBound = 50.0;
        double randomDouble3 = random.nextDouble() * (upperBound - lowerBound) + lowerBound;
        System.out.println("Random Double 3 (" + lowerBound + " to " + upperBound + "): " + randomDouble3);

        // Create a random double within a specified range using nextDouble(double
        // bound)
        double rangeStart = 30.0;
        double rangeEnd = 70.0;
        double randomDouble4 = random.nextDouble() * (rangeEnd - rangeStart) + rangeStart;
        System.out.println("Random Double 4 (" + rangeStart + " to " + rangeEnd + "): " + randomDouble4);
    }
}
