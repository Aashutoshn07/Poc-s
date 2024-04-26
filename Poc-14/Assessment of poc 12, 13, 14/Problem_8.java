import java.util.ArrayList;
import java.util.List;

public class Problem_8 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(20);
        array.add(30);
        array.add(10);

        removeFirstOccurence(array, 10);
        System.out.println(array);
    }

    public static void removeFirstOccurence(List<Integer> array, int element) {
        int index = array.indexOf(element);

        if (index != -1) {
            array.remove(index);
        } else {
            System.out.println("Invalid Index!");
        }
    }
}
