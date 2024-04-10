import java.util.Vector;

public class VecReplace {
    public static void main(String[] args) {
        Vector<Object> vector = new Vector<>();

        vector.add(0, new Integer(10));
        vector.add(1, new Integer(20));
        vector.add(0, new Integer(30));
        vector.add(0, new Integer(40));

        System.out.println("Vector before replacement:");
        for (Object obj : vector) {
            Integer intValue = (Integer) obj;
            System.out.println(intValue);
        }

        vector.set(1, new Integer(50));

        System.out.println("\nVector after replacement:");
        for (Object obj : vector) {
            Integer intValue = (Integer) obj;
            System.out.println(intValue);
        }
        // System.out.println();
    }
}
