public class PrimitiveToString {
    public static void main(String[] args) {
        int i = 10;
        String str = Integer.toString(i);
        System.out.println("Convert Primitive Integer to String!" + str);

        double d = 20.5;
        boolean b = true;
        char c = 'A';
        long l = 1000L;
        float f = 15.7f;
        short s = 50;
        byte by = 3;

        // Convert other primitive data types to String using respective wrapper class
        // toString() methods
        String doubleToStr = Double.toString(d);
        String booleanToStr = Boolean.toString(b);
        String charToStr = Character.toString(c);
        String longToStr = Long.toString(l);
        String floatToStr = Float.toString(f);
        String shortToStr = Short.toString(s);
        String byteToStr = Byte.toString(by);

        // Print the converted Strings with appropriate messages
        System.out.println("Primitive double to String: " + doubleToStr);
        System.out.println("Primitive boolean to String: " + booleanToStr);
        System.out.println("Primitive char to String: " + charToStr);
        System.out.println("Primitive long to String: " + longToStr);
        System.out.println("Primitive float to String: " + floatToStr);
        System.out.println("Primitive short to String: " + shortToStr);
        System.out.println("Primitive byte to String: " + byteToStr);

    }
}
