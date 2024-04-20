package Problem_3;

import java.util.ArrayList;
import java.util.Collections;

public class Copy {
    public static void main(String[] args) {
        ArrayList<Integer> srcList = new ArrayList<>();
        srcList.add(1);
        srcList.add(2);
        ArrayList<Integer> destList = new ArrayList<>(Collections.nCopies(srcList.size(), 0));
        Collections.copy(destList, srcList);
        System.out.println("Destinition list after copy:" + destList);
    }
}
