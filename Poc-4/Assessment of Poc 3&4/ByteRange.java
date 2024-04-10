public class ByteRange {
    public static void main(String[] args) {
        int numberToCheck = 121; 
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);
        if (isWithinByteRange(numberToCheck)) {
            System.out.println(numberToCheck + " is within the range of a byte.");
        } else {
            System.out.println(numberToCheck + " is NOT within the range of a byte.");
        }
    }

    public static boolean isWithinByteRange(int number) {
        try {
            byte byteValue = (byte) number;
            // System.out.println(byteValue);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
