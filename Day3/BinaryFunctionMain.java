import java.util.function.BiFunction;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class BinaryFunctionMain {
    public static void main(String[] args) {
        // BiFunction: Takes two inputs and produces a result
        BiFunction<Integer, Integer, Integer> addFunction = (a, b) -> a + b;
        int sum = addFunction.apply(10, 20);
        System.out.println("Sum: " + sum);

        // BiConsumer: Accepts two inputs and performs an action
        BiConsumer<String, Integer> printMessage = (message, count) -> {
            for (int i = 0; i < count; i++) {
                System.out.println(message);
            }
        };
        printMessage.accept("Hello", 3);

        // BiPredicate: Tests a condition with two inputs
        BiPredicate<Integer, Integer> isEqualPredicate = (x, y) -> x.equals(y);
        boolean equal = isEqualPredicate.test(10, 10);
        System.out.println("Are they equal? " + equal);

        // BinaryOperator: Performs a binary operation on two inputs
        BinaryOperator<Integer> multiplyOperator = (num1, num2) -> num1 * num2;
        int product = multiplyOperator.apply(3, 4);
        System.out.println("Product: " + product);
    }
}
