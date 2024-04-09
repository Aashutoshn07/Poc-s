import java.util.TreeMap;

public class TreeMapMain {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        treeMap.put("Apple", 10);
        treeMap.put("Banana", 20);
        treeMap.put("Orange", 30);

        System.out.println("TreeMap: " + treeMap);

        System.out.println("Value of 'Banana': " + treeMap.get("Banana"));

        System.out.println("Contains key 'Orange': " + treeMap.containsKey("Orange"));

        System.out.println("Contains value 30: " + treeMap.containsValue(30));

        System.out.println("Keys: " + String.join(", ", treeMap.keySet()));
        System.out.println("Values: " + treeMap.values());

        treeMap.remove("Orange");

        System.out.println("Size of TreeMap: " + treeMap.size());

        System.out.println("Iterating over entries:");
        treeMap.forEach((key, value) -> System.out.println(key + " -> " + value));

        treeMap.clear();
        System.out.println("TreeMap after clearing: " + treeMap);
    }
}
