package Problem_6;

public class CharArrayCopyDemo {
    public static void main(String[] args) {
        char[] data = { 'n', 'a', 'r', 'e', 's', 'h', 'i', 't', 'e', 'c', 'h' };

        String strValueOf = String.valueOf(data);
        System.out.println("String using valueOf(): " + strValueOf);

        // Using copyValueOf() method
        String strCopyValueOf = String.copyValueOf(data);
        System.out.println("String using copyValueOf(): " + strCopyValueOf);
    }
}
