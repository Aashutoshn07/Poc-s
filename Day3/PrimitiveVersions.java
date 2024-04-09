import java.util.function.IntSupplier;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.function.IntBinaryOperator;

public class PrimitiveVersions {
    public static void main(String[] args) {
        // IntSupplier: Supplies an integer value
        IntSupplier randomIntSupplier = () -> (int) (Math.random() * 100);
        int randomInt = randomIntSupplier.getAsInt();
        System.out.println("Random integer: " + randomInt);

        // IntConsumer: Accepts an integer value
        IntConsumer printIntConsumer = num -> System.out.println("Received integer: " + num);
        printIntConsumer.accept(42);

        // IntPredicate: Tests an integer condition
        IntPredicate isEvenPredicate = num -> num % 2 == 0;
        System.out.println("Is 10 even? " + isEvenPredicate.test(10));

        // IntFunction: Maps an integer input to an output
        IntFunction<String> intToStringFunction = num -> "Number: " + num;
        String result = intToStringFunction.apply(123);
        System.out.println(result);

        // IntUnaryOperator: Unary operation on integers
        IntUnaryOperator incrementByOneOperator = num -> num + 1;
        int incremented = incrementByOneOperator.applyAsInt(5);
        System.out.println("Incremented by one: " + incremented);

        // IntBinaryOperator: Binary operation on integers
        IntBinaryOperator multiplyOperator = (num1, num2) -> num1 * num2;
        int product = multiplyOperator.applyAsInt(3, 4);
        System.out.println("Product: " + product);
    }
}
