import java.util.ArrayList;
import java.util.List;

public class ArrayListMain{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(23);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println(list.remove(0));
        System.out.println(list.contains(40));

        System.out.println(list.toString());
        System.out.println(list);
        for(int i: list){
            System.out.println(i);
        }
    }
}