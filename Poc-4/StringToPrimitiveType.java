public class StringToPrimitiveType {
    public static void main(String[] args) {
        try {
            String str = "100";
            String str1 = "9522040201";

            byte byteValue = Byte.parseByte(str);
            System.out.println("Byte Value: " + byteValue);

            int intValue = Integer.parseInt(str);
            System.out.println("Int Value: " + intValue);

            float floatValue = Float.parseFloat(str);
            System.out.println("Float Value: " + floatValue);

            double doubleValue = Double.parseDouble(str);
            System.out.println("Double Value: " + doubleValue);

            long longValue = Long.parseLong(str1);
            System.out.println("Long Value: " + longValue);

            short shortValue = Short.parseShort(str);
            System.out.println("Short Value: " + shortValue);

            boolean booleanValue = Boolean.parseBoolean(str);
            System.out.println("Boolean Value: " + booleanValue);

            char[] charArray = str.toCharArray();
            System.out.print("Character Array: ");
            for (char c : charArray) {
                System.out.print(c + " ");
            }
            System.out.println();
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
