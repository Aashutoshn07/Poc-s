import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.File;

public class NestedTry {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream(new File(args[0]));
            try {
                int res = 0;
                int num = 2;
                res = num / 0;
                System.out.println("The result is: " + res);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by 0!");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bound: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Unknown Exception occurd! " + e.getMessage());
        }
    }
}
