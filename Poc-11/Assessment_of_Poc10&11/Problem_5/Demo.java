package Problem_5;

public class Demo {
    public static void main(String[] args) {
        int n = 10; // Change this to generate Fibonacci series up to a different number
        System.out.println("Fibonacci Series up to " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
    }

    public static int fibonacciRecursive(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }
}
