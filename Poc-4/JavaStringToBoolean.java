public class JavaStringToBoolean {
    public static void main(String[] args) {
        String str = "true";

        Boolean blnObj1 = new Boolean(str);
        System.out.println("Boolean object using constructor: " + blnObj1);

        Boolean blnObj2 = Boolean.valueOf(str);
        System.out.println("Boolean object using valueOf(): " + blnObj2);

        Boolean boolVar = true;
        String strFromBool = boolVar.toString();
        System.out.println("String from Boolean variable: " + strFromBool);

        boolean primitiveBool = false;

        Boolean boolObj1 = new Boolean(primitiveBool);
        System.out.println("Boolean object from primitive (constructor): " + boolObj1);

        Boolean boolObj2 = Boolean.valueOf(primitiveBool);
        System.out.println("Boolean object from primitive (valueOf): " + boolObj2);
    }
}
