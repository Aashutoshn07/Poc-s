public class Main {
    public static void main(String[] args) {
        StringOperation stringOperation = new StringOperation();

        stringOperation.setStrVar("Hello World!");

        String reversedBuffer = stringOperation.reverseWithBuffer();
        System.out.println("Reversed with StringBuffer: " + reversedBuffer);

        String reversedWithoutBuffer = stringOperation.reverseWithoutBuffer();
        System.out.println("Reversed without StringBuffer: " + reversedWithoutBuffer);
    }
}