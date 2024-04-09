import java.util.stream.Stream;

public class StreamDataMethods {
    public static void main(String[] args) {
        // Create a stream of integers
        Stream<Integer> numbersStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter even numbers
        Stream<Integer> evenNumbersStream = numbersStream.filter(num -> num % 2 == 0);

        // Calculate the sum of even numbers
        int sumOfEvenNumbers = evenNumbersStream.reduce(0, Integer::sum);

        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);

        // Reset the stream for reuse
        numbersStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Map each number to its square
        Stream<Integer> squaredNumbersStream = numbersStream.map(num -> num * num);

        // Calculate the average of squared numbers
        double averageOfSquaredNumbers = squaredNumbersStream
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Average of squared numbers: " + averageOfSquaredNumbers);
    }
}
