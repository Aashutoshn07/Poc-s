package Problem_3;

import java.util.ArrayList;
import java.util.Collections;

public class Rotate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        Collections.rotate(list, 1);
        System.out.println(list);
    }
}
