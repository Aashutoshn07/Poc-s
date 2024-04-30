import java.io.IOException;

public class Problem9B {
    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws IOException {
        if (age < 18) {
            throw new IOException("Age Must be above 18 ");
        }
        System.out.println("Age Validate Successfully.");
    }
}
