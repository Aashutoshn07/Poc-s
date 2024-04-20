package Problem_3;

import java.util.ArrayList;
import java.util.Collections;

public class Frequency {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(1);
        int frq = Collections.frequency(list, 2);
        System.out.println("Frequency: " + frq);
    }
}
