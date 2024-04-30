import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "orange");

        List<String> upperCase = list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Uppercase words: " + upperCase);

        list.stream()
        .map(String:: toUpperCase)
        .collect(Collectors.toList()).forEach(System.out::println);
    }
}
