import java.util.HashMap;
import java.util.Map;

public class Problem_9 {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(1, 1);
        hashMap.put(2, 2);
        hashMap.put(3, 3);
        hashMap.put(4, 4);
        hashMap.put(5, 5);

        HashMap<Integer, Integer> hashMap1 = new HashMap<>();
        hashMap1.put(1, 1);
        hashMap1.put(2, 2);
        hashMap1.put(3, 3);
        hashMap1.put(4, 4);
        hashMap1.put(5, 0);

        boolean comman = hasCommonValues(hashMap, hashMap1);

        if (comman) {
            System.out.println("Common Values");
        } else {
            System.out.println("Not Common");
        }
    }

    public static boolean hasCommonValues(HashMap<Integer, Integer> map1, HashMap<Integer, Integer> map2) {
        for (Map.Entry<Integer, Integer> entry : map1.entrySet()) {
            if (map2.containsKey(entry.getValue()))
                return true;
        }
        return false;
    }
}
