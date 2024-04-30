import java.util.Arrays;
import java.util.List;

public class Problem4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int limit = 10;
        int sum = list.stream()
                .limit(limit)
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum of n numbers is: " + sum);

    }
}
