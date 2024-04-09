import java.util.function.UnaryOperator;

public class UnaryFunctionMain {
    public static void main(String[] args) {
        // UnaryOperator: Unary operation on a single input
        UnaryOperator<Integer> squareOperator = num -> num * num;
        
        // Calculate the square using the UnaryOperator
        int squared = squareOperator.apply(5);
        System.out.println("Square of 5: " + squared);  // Output: Square of 5: 25
        
        // Calculate the square of a negative number
        int negativeSquared = squareOperator.apply(-4);
        System.out.println("Square of -4: " + negativeSquared);  // Output: Square of -4: 16
    }
}
