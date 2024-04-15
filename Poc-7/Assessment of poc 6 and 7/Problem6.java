import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (Integer) ");
        int a = 10;
        int b = sc.nextInt();
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Denominator cannot be zero " + e);
        }finally{
            System.out.println("Thank You for use our service, visit again! ");
        }
    }
}
