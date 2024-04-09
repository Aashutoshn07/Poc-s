import java.util.function.Predicate;

public class PredicateExpression{
    public static void main(String[] args) {
        Predicate<Integer> isPositive = num -> num > 0;

        // Test the Predicate with some numbers
        System.out.println("Is 5 positive? " + isPositive.test(5));    // Output: true
        System.out.println("Is -3 positive? " + isPositive.test(-3));  // Output: false
    }
}