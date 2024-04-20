package Problem_3;

import java.util.ArrayList;
import java.util.Collections;

public class Fill {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Collections.nCopies(5, 0));
        Collections.fill(list, 10);
        System.out.println("List after filling with 10: " + list);
    }
}
