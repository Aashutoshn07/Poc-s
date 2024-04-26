import java.util.*;

public class Problem_10 {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 50);
        map.put("Bob", 30);
        map.put("Charlie", 80);
        map.put("David", 40);
        map.put("Emily", 70);

        // Sort the HashMap by values in descending order
        LinkedHashMap<String, Integer> sortedMap = sortHashMapByValues(map);

        // Print the sorted map
        System.out.println("Sorted HashMap by values in descending order:");
        for (Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static LinkedHashMap<String, Integer> sortHashMapByValues(HashMap<String, Integer> map) {
        // Convert HashMap to List of Map entries
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());

        // Sort the list by values in descending order
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue()); // Sort in descending order
            }
        });

        // Create a new LinkedHashMap to store sorted entries
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
}
