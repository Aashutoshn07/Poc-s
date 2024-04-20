package Problem_3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(5);
        list.add(1);
        list.add(90);
        list.add(2);

        Collections.sort(list);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(10);
        list2.add(100);
        list2.add(13);
        list2.add(15);
        list2.add(12);
        list2.add(1);
        list2.add(9);
        list2.add(16);
        list2.add(19);
        // System.out.println(list2.sor
        Collections.sort(list2);
        System.out.println(list2);

    }
}
