import java.util.HashSet;

public class Problem_1 {
    public static void main(String[] args) {
        HashSet<String> fruitSet = new HashSet<>();

        fruitSet.add("Apple");
        fruitSet.add("Banana");
        fruitSet.add("Orange");

        System.out.println(fruitSet);

        for (String fruit : fruitSet) {
            System.out.println(fruit);
        }
    }
}