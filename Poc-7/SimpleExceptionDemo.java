import java.util.Scanner;

public class SimpleExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the first number.");
            int a = Integer.parseInt(sc.nextLine());
            System.out.println("Enter the second number.");
            int b = Integer.parseInt(sc.nextLine());
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Error: NumberFormateException occured.");
            System.out.println("Error Message: " + e.getMessage());
            System.out.println("Stack Trace:");
            e.printStackTrace();
            System.out.println("String Representation: " + e.toString());
        }
        sc.close();
    }
}