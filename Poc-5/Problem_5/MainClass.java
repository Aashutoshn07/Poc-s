package Problem_5;

public class MainClass {
    public static void main(String[] args) {
        StringOperations stringOperation = new StringOperations("Hello");
        if (stringOperation.hasDigit()) {
            System.out.println("The string contains digits.");
        } else {
            System.out.println("The string does not contain any digits.");
        }
    }
}
