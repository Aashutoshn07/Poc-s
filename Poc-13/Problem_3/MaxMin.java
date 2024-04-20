package Problem_3;

import java.util.ArrayList;
import java.util.Collections;

public class MaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(15);

        int max = Collections.max(list);
        int min = Collections.min(list);

        System.out.println("Min Value: " + min);
        System.out.println("Max Value: " + max);

    }
}
