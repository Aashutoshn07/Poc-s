import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;



public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList <Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println(list);
        // list.remove(3);

        ArrayList <Integer> arlist = new ArrayList<>(list);
        System.out.println(arlist);

        // ArrayList<Integer> arrlist=list.clone();
        // System.out.println(list);
        // list.removeAll(list);
        // System.out.println(list);
    }
}
