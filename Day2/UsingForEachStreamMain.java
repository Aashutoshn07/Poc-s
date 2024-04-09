import java.util.Arrays;
import java.util.List;

public class UsingForEachStreamMain {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango");

        // Iterate over filtered elements using forEach method of Streams
        fruits.stream()
              .filter(fruit -> fruit.startsWith("A")) // Filter fruits starting with "A"
              .forEach(filteredFruit -> System.out.println(filteredFruit));
    }
}
