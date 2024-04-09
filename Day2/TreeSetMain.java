import java.util.TreeSet;

public class TreeSetMain {
    public static void main(String[] args) {
        // TreeSet<Integer> treeset = new TreeSet<>();

        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);
        
        System.out.println(set1);
        System.out.println(set2);

        TreeSet<Integer> unionSet = new TreeSet<>(set1);
        unionSet.addAll(set2);

        System.out.println("Union of set1 and set2: " + unionSet);
    }
}
