package Problem_3;

import java.util.ArrayList;
import java.util.Collections;

public class BinarySerach {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(19);
        list.add(32);
        list.add(87);
        list.add(1);
        int index = Collections.binarySearch(list, 87);
        System.out.println("Index of 5: " + index);
    }
}
