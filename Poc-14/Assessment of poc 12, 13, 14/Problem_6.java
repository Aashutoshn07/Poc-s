import java.util.ArrayList;

public class Problem_6 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("Original ArrayList: " + list);

        if (list.size() > 2) {
            list.subList(1, list.size() - 1).clear();
        }

        System.out.println("Modified Array: " + list);
    }
}
