import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReferenceWIthStream {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango");
        // Filter the list to keep only strings starting with "A" using method reference
        List<String> filteredFruits = fruits.stream()
                .filter(StringUtils::startsWithA)
                .collect(Collectors.toList());

        // Print the filtered fruits
        System.out.println("Fruits starting with 'A': " + filteredFruits);
    }
}

class StringUtils {
    public static boolean startsWithA(String str) {
        return str.startsWith("A");
    }
}
