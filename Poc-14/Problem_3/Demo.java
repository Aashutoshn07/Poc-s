package Problem_3;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

// import javax.swing.text.html.HTMLDocument.Iterator;

public class Demo {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();

        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);

        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String,Integer> entry = iterator.next();
            System.out.println("Key: "+ entry.getKey()+", Value: "+ entry.getValue());
        }
    }
}
