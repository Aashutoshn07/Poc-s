import java.util.Map;
import java.util.TreeMap;

public class MapTechniques {
    public static void main(String[] args) {
        Map<String, Integer> atomNums = new TreeMap<String, Integer>();

        atomNums.put("Hydrogen", 1);
        atomNums.put("Helium", 2);
        atomNums.put("Carbon", 6);
        atomNums.put("Oxygen", 8);

        System.out.println("Entities: " + atomNums.size());

        System.out.println("Keys and values: ");

        for (Map.Entry<String, Integer> entry : atomNums.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Values: " + entry.getValue());
        }
        String keyToCheck = "Carbon";
        int valueToCheck = 8;

        if (atomNums.containsKey(keyToCheck)) {
            System.out.println(keyToCheck + " is present in the map.");
        } else {
            System.out.println(keyToCheck + " is not present in the map.");
        }
        if (atomNums.containsValue(valueToCheck)) {
            System.out.println(valueToCheck + " is present in the map.");
        } else {
            System.out.println(valueToCheck + " is not present in the map.");
        }
    }
}
