public class ByteToNumericPrimitiveTypesDemo {
    public static void main(String[] args) {
        Byte byteObj = new Byte((byte) 10);

        byte byteValue = byteObj.byteValue();
        short shortValue = byteObj.shortValue();
        int intValue = byteObj.intValue();
        float floatValue = byteObj.floatValue();
        double doubleValue = byteObj.doubleValue();
        long longValue = byteObj.longValue();

        System.out.println("Byte to byte: " + byteValue);
        System.out.println("Byte to short: " + shortValue);
        System.out.println("Byte to int: " + intValue);
        System.out.println("Byte to float: " + floatValue);
        System.out.println("Byte to double: " + doubleValue);
        System.out.println("Byte to long: " + longValue);

        // Convert java.lang.Double to other primitive numeric data types

        Double doubleObj = new Double(10.5);

        byte byteValueFromDouble = doubleObj.byteValue();
        short shortValueFromDouble = doubleObj.shortValue();
        int intValueFromDouble = doubleObj.intValue();
        float floatValueFromDouble = doubleObj.floatValue();
        long longValueFromDouble = doubleObj.longValue();

        // Print converted values for Double
        System.out.println("Double to byte: " + byteValueFromDouble);
        System.out.println("Double to short: " + shortValueFromDouble);
        System.out.println("Double to int: " + intValueFromDouble);
        System.out.println("Double to float: " + floatValueFromDouble);
        System.out.println("Double to long: " + longValueFromDouble);

    }
}
