package Problem_3;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffel {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(10);
        list.add(30);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
