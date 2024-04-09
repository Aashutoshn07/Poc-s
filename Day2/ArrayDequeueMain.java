import java.util.ArrayDeque;

public class ArrayDequeueMain {
    public static void main(String[] args) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();

        arrayDeque.offerFirst(1);
        arrayDeque.offerFirst(2);
        arrayDeque.offerFirst(3);

        arrayDeque.offerLast(4);
        arrayDeque.offerLast(5);

        System.out.println("ArrayDeque: " + arrayDeque);

        System.out.println("First element (peekFirst): " + arrayDeque.peekFirst());
        System.out.println("Last element (peekLast): " + arrayDeque.peekLast());

        System.out.println("Removing first element (pollFirst): " + arrayDeque.pollFirst());
        System.out.println("Removing last element (pollLast): " + arrayDeque.pollLast());

        System.out.println("ArrayDeque after removal: " + arrayDeque);
    }
}
