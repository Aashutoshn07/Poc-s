import java.util.*;

public class Demo {
    public static void main(String[] args) {
        // Create two TreeMaps
        TreeMap<Integer, String> treeMap1 = new TreeMap<>();
        treeMap1.put(1, "Apple");
        treeMap1.put(2, "Banana");
        treeMap1.put(3, "Cherry");

        TreeMap<Integer, String> treeMap2 = new TreeMap<>();
        treeMap2.put(1, "Apple");
        treeMap2.put(2, "Banana");
        treeMap2.put(3, "Cherry");
        // Set<Map.Entry<Integer, String>> set = treeMap1.entrySet();

        // Check if treeMap1 and treeMap2 are equal
        boolean isEqual = checkTreeMapsEquality(treeMap1, treeMap2);
        System.out.println("TreeMaps are equal: " + isEqual);
    }

    public static <Integer, String> boolean checkTreeMapsEquality(TreeMap<Integer, String> map1,
            TreeMap<Integer, String> map2) {
        // Check if the size of the maps is different
        if (map1.size() != map2.size()) {
            return false;
        }

        // Check if each key-value pair is equal in both maps
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue(); 
             
            Set<Map.Entry<Integer,String>> entries= map1.entrySet();
             IteratorDemo<Map.Entry<Integer,String>> enIterator=entries.iterator();
             while (enIterator.hasNext()) {

                
             }

            // Check if the key exists in map2 and if the corresponding values are equal
            if (!map2.containsKey(key) || !Objects.equals(value, map2.get(key))) {
                return false;
            }
        }

        return true; // Maps are equal
    }
}
