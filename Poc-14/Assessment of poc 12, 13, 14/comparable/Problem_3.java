package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Problem_3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(8);

        Collections.sort(numbers, new Comparator<Integer>() {

            @Override
            public int compare(Integer num1, Integer num2) {
                return num2.compareTo(num1);
            }
        });
        Collections.sort(numbers, (num1, num2) -> num2.compareTo(num1));

        System.out.println("Sorted ArrayList in Decending order!");

        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
