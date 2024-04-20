package Problem_3;

import java.util.ArrayList;
import java.util.Collections;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(15);
        list.add(20);

        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
