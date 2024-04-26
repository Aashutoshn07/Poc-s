package comparable.comparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Employees> {

    // @Override
    // public int compare(Employees e1, Employees e2) {
    // return e1.ename.compareTo(e2.getEname());
    // }
    @Override
    public int compare(Employees e1, Employees e2) {
        return e1.ename.compareTo(e2.getEname());
    }

}
