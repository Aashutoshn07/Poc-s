import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem3 {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "grapes");

        // Use the Stream API to filter strings with more than 5 characters
        List<String> filteredWords = words.stream()
                .filter(word -> word.length() <= 5) // Filter strings with length less than or equal to 5
                .collect(Collectors.toList()); // Collect the filtered strings into a new list

        // Print the filtered list of strings
        System.out.println("Filtered words: " + filteredWords);
    }
}
