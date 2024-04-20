import java.util.ArrayList;
import java.util.Vector;

public class Problem_3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");

        Vector<String> vector = new Vector<>();
        vector.add("Eldberry");
        vector.add("Fig");
        vector.add("Grape");

        int indexToInsert = 1;
        arrayList.addAll(indexToInsert, vector);

        System.out.println("Elements in ArrayList");

        for (String element : arrayList) {
            System.out.println(element);
        }
    }
}
