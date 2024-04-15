package Problem_7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ClassCastExceptionDemo {
    public ClassCastExceptionDemo() {
        List<Object> list = new ArrayList<>();
        list.add("one");

        // Iterate through the list and try to cast each element to Integer
        Iterator<Object> it = list.iterator();
        while (it.hasNext()) {
            // Intentionally throw a ClassCastException by trying to cast a String to an
            // Integer
            Integer i = (Integer) it.next();
        }
    }

    public static void main(String[] args) {
        new ClassCastExceptionDemo();
    }
}
