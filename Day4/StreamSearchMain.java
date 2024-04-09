import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamSearchMain {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve");

        // Using findFirst to find the first element
        Optional<String> firstElement = names.stream().findFirst();
        System.out.println("First Element: " + firstElement.orElse("Not found"));

        // Using findAny to find any element
        Optional<String> anyElement = names.stream().findAny();
        System.out.println("Any Element: " + anyElement.orElse("Not found"));

        // Using anyMatch to check if any element matches a condition
        boolean anyMatch = names.stream().anyMatch(name -> name.startsWith("A"));
        System.out.println("Any element starts with 'A': " + anyMatch);

        // Using allMatch to check if all elements match a condition
        boolean allMatch = names.stream().allMatch(name -> name.length() > 3);
        System.out.println("All elements have length greater than 3: " + allMatch);

        // Using noneMatch to check if no element matches a condition
        boolean noneMatch = names.stream().noneMatch(name -> name.contains("X"));
        System.out.println("No element contains 'X': " + noneMatch);
    }
}
