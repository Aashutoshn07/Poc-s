import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ArrayGenerics {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Vishal");
        list.add("Vijay");
        list.add("Mahi");
        list.add("Walter");

        System.out.println(list);
        // System.out.println(list.get(0));
        // System.out.println(list.get(1));
        // System.out.println(list.get(2));
        // System.out.println(list.get(3));
        // System.out.println(list.get(4));
        String str = list.get(3);
        System.out.println(str);

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            itr.remove();
            System.out.println(itr.next());
        }
    }
}
