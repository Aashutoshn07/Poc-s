import java.util.Map;
import java.util.TreeMap;

public class Problem_13 {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(10, "Ten");
        treeMap.put(20, "Twenty");
        treeMap.put(30, "Thirty");

        Map<Integer, String> treeMap2 = new TreeMap<>();

        treeMap2.put(10, "Ten");
        treeMap2.put(20, "Twenty");
        treeMap2.put(30, "Thirty");

        System.out.println(treeMap.equals(treeMap2));
    }
}
