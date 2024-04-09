import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ApiStream {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Using peek() to print each element during processing
        List<Integer> squaredNumbers = numbers.stream()
                .peek(num -> System.out.println("Processing: " + num))
                .mapToInt(num -> num * num) // Using mapToInt() to map to primitive int
                .boxed() // Converting back to Integer stream
                .peek(squaredNum -> System.out.println("Squared: " + squaredNum))
                .collect(Collectors.toList());

        System.out.println("Squared Numbers: " + squaredNumbers);
    }
}
