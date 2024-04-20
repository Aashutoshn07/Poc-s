import java.util.ArrayList;
import java.util.List;

public class Problem_2 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("is");
        stringList.add("fun");

        String[] stringArray = stringList.toArray(new String[0]);

        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}
