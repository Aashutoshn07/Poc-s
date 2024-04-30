public class Problem10 {
    public static void main(String[] args) {
        try {
            int arr[] = { 1, 2, 3 };
            int result = arr[3];

            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed!");
        }
    }
}
