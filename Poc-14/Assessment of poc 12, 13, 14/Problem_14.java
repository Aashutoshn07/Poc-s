import java.util.HashSet;

public class Problem_14 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(2);
        hashSet.add(8);
        hashSet.add(1);
        hashSet.add(3);

        System.out.println(hashSet);

        // TreeSet<Integer> sortedSet = new TreeSet<>(hashSet);
        // System.out.println("Sorted HashSet in ascending order: " + sortedSet);

        // sortHashSet(hashSet);
        // System.out.println(hashSet);
    }

    // public static void sortHashSet(HashSet<Integer> hashset) {
    // ArrayList<Integer> list = new ArrayList<>(hashset);

    // System.out.println(list);
    // hashset = new HashSet<>(list);

    // }
}
