import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem6 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Strawberry", "Orange", "Ski", "Cherry");

        char filterLetter = 'A';
        List<String> filteredWords = words.stream()
                .filter(word -> word.charAt(0) != filterLetter) // Filter strings not starting with the specified letter
                .collect(Collectors.toList());

        System.out.println("Filtered words: " + filteredWords);
    }
}
