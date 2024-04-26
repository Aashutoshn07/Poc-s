import java.util.ArrayList;
import java.util.List;

public class Problem_12 {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        List<Integer> list2 = new ArrayList<>();
        list2.add(60);
        list2.add(70);
        list2.add(80);
        list2.add(90);
        list2.add(100);

        // List<Integer> concatenatedList = concatenateLists(list1, list2);
        List<Integer> concatenatedList = new ArrayList<>();
        concatenatedList.addAll(list1);
        concatenatedList.addAll(list2);

        System.out.println("Concatenated ArrayList: " + concatenatedList);
    }

    public static <T> List<T> concatenateLists(List<T> list1, List<T> list2) {
        List<T> concatenatedList = new ArrayList<>(list1);
        concatenatedList.addAll(list2);
        return concatenatedList;
    }
}
