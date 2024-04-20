import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayToList {
    public static void main(String[] args) {
        String[] array = { "Apple", "Banana", "Cherry", " Date" };
        List<String> list = Arrays.asList(array);
        System.out.println("Elements in list:");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }

    }
}