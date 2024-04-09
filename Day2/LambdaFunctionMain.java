import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// filter function with Lambda expression
public class LambdaFunctionMain {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter the list to keep only even numbers using lambda expression
        List<Integer> evenNumbers = numbers.stream()
                                           .filter(num -> num % 2 == 0)
                                           .collect(Collectors.toList());

        // Print the filtered even numbers
        System.out.println("Even Numbers: " + evenNumbers);
    }
}


// import java.util.Arrays;
// import java.util.List;
// import java.util.function.Predicate;
// import java.util.stream.Collectors;

// public class Main {
//     public static void main(String[] args) {
//         // Create a list of integers
//         List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//         // Define a predicate to check if a number is even
//         Predicate<Integer> isEven = new Predicate<Integer>() {
//             @Override
//             public boolean test(Integer num) {
//                 return num % 2 == 0;
//             }
//         };

//         // Filter the list to keep only even numbers using the defined predicate
//         List<Integer> evenNumbers = numbers.stream()
//                                            .filter(isEven)
//                                            .collect(Collectors.toList());

//         // Print the filtered even numbers
//         System.out.println("Even Numbers: " + evenNumbers);
//     }
// }
