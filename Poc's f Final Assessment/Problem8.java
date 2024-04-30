import java.util.HashSet;
import java.util.Set;

public class Problem8 {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(8);
        numbers.add(15);
        numbers.add(1);
        numbers.add(5);
        // numbers.add(null);

        System.out.println(numbers);
        Integer minElement = numbers.stream()
                .min(Integer::compareTo)
                .orElse(null);

        if (minElement != null) {
            System.out.println("Minimum element: " + minElement);
        } else {
            System.out.println("HashSet is empty.");
        }
    }
}
