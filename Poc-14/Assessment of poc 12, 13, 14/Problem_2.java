import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem_2 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "one");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");

        // Iterator<Map.Entry<Integer, String>> iterator =
        // hashMap.entrySet().iterator();
        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();

        System.out.println("Key-value Pairs in HashMap: ");
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
