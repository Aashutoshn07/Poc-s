package Problem_4;

public class MainClass {
    public static void main(String[] args) {
        // Create an object of StringOperation
        StringOperation stringOperation = new StringOperation("  Hello, world!    ");

        // Display the original string
        System.out.println("Original string: " + stringOperation.getStrVar());

        // Remove trailing spaces
        stringOperation.removeTrailingSpaces();

        // Display the modified string
        System.out.println("String after removing trailing spaces: " + stringOperation.getStrVar());
    }
}
