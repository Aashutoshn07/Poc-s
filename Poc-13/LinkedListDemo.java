import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");

        System.out.println("Initial LinkedList" + linkedList);

        linkedList.addFirst("Orange");
        System.out.println("LinkedList after adding first: " + linkedList);

        linkedList.addLast("Almond");
        System.out.println("LinkedList after adding last: " + linkedList);

        String firstElement = linkedList.getFirst();
        String lastElement = linkedList.getLast();

        System.out.println("First Name: " + firstElement);
        System.out.println("Last Element: " + lastElement);

        linkedList.removeFirst();
        System.out.println("LinkedList after removing first: " + linkedList);

        linkedList.removeLast();
        System.out.println("LinkedList after removing last: " + linkedList);

        boolean containsBanana = linkedList.contains("Banana");
        System.out.println("LinkedList contains 'Banana': " + containsBanana);

        int size = linkedList.size();
        System.out.println("Size of LinkedList: " + size);

        linkedList.remove(2);
        System.out.println("LinkedList after removing element at index 2: " + linkedList);

        linkedList.clear();
        System.out.println("LinkedList after cleaning: " + linkedList);
    }
}
