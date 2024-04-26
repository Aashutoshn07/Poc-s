import java.util.HashSet;
import java.util.Iterator;

public class Problem_7 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(32);
        set.add(90);
        set.add(32);
        set.add(91);
        set.add(91);

        System.out.println(set);
        System.out.println(findMaxElement(set));

    }

    public static int findMaxElement(HashSet<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        int max = Integer.MIN_VALUE;

        for (int num : set) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
