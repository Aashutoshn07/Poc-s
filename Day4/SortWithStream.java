import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortWithStream {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Mango");

        // Sort the list using Stream API
        List<String> sortedFruits = fruits.stream()
                .sorted() // Sort in natural order (alphabetically for strings)
                .collect(Collectors.toList());

        // Print the sorted list
        System.out.println("Sorted fruits: " + sortedFruits);

        // Sort the list in reverse order using a Comparator
        List<String> reverseSortedFruits = fruits.stream()
                .sorted(Comparator.reverseOrder()) // Sort in reverse order
                .collect(Collectors.toList());

        // Print the reverse sorted list
        System.out.println("Reverse sorted fruits: " + reverseSortedFruits);
    }
}
