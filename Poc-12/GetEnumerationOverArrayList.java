import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class GetEnumerationOverArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");

        Enumeration<String> enumeration = Collections.enumeration(arrayList);

        System.out.println("Elements in the ArrayList: ");

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}
