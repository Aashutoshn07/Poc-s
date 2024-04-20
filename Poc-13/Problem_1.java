import java.util.ArrayList;
import java.util.List;

public class Problem_1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();

        stringList.add("Hello");
        stringList.add("World");

        List<StringBuilder> mutableString = new ArrayList<>();
        for (String str : stringList) {
            mutableString.add(new StringBuilder(str));
        }

        for (String str : stringList) {
            String immutableStr = str;
            System.out.println(immutableStr);
        }
    }
}