import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMain {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Use a stream to filter even numbers and collect them into a new list
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        // Print the filtered even numbers
        System.out.println("Even Numbers: " + evenNumbers);
    }
}
