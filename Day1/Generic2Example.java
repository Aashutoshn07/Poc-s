import java.util.*;

class TestGenerics2 {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        Map<Integer, String> map2 = new Hashtable<>();
        map.put(1, "vijay");
        map.put(4, "umesh");
        map.put(2, "ankit");
        map.remove(1);

        // Now use Map.Entry for Set and Iterator
        Set<Map.Entry<Integer, String>> set = map.entrySet();

        Iterator<Map.Entry<Integer, String>> itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry e = itr.next();// no need to typecast
            System.out.println(e.getKey() + " " + e.getValue());
        }

    }
}