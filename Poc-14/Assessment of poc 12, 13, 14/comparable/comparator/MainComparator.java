package comparable.comparator;
import java.util.ArrayList;
import java.util.Collections;
// import java.util.Comparator;
import java.util.List;

public class MainComparator {
    public static void main(String[] args) {
        List<Employees> list = new ArrayList<>();
        list.add(new Employees(101, "esa")); 
        list.add(new Employees(101, "asa"));
        list.add(new Employees(101, "gsa"));
        System.out.println(list);
        Collections.sort(list, new MyComparator());
        System.out.println(list);
    }
}
