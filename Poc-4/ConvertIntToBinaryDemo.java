public class ConvertIntToBinaryDemo {
    public static void main(String[] args) {
        int decimalInt = 100; 

        String binaryStr = Integer.toBinaryString(decimalInt);
        System.out.println("Decimal to Binary: " + binaryStr);

        String hexStr = Integer.toHexString(decimalInt);
        System.out.println("Decimal to Hexadecimal: " + hexStr);

        String octalStr = Integer.toOctalString(decimalInt);
        System.out.println("Decimal to Octal: " + octalStr);
    }
}
