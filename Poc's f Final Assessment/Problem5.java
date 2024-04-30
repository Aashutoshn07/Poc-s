import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem5 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "level", "radar", "cherry", "noon");

        // Use the Stream API to filter out palindromes
        List<String> nonPalindromes = words.stream()
                .filter(word -> !isPalindrome(word)) // Filter strings that are not palindromes
                .collect(Collectors.toList()); // Collect the filtered strings into a new list

        // Print the filtered list of strings
        System.out.println("Non-palindromes: " + nonPalindromes);
    }

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
