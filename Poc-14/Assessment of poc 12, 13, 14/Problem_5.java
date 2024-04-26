import java.util.ArrayList;
import java.util.List;

public class Problem_5 {
    public static void main(String[] args) {
        List<String> lists = new ArrayList<>();
        lists.add("Having");
        lists.add("Fun");
        lists.add("With");
        lists.add("Friends");
        lists.add("Having");
        lists.add("Good to see you all");

        System.out.println("Original array!!");
        System.out.println(lists);

        String removeElement = "Having";

        lists.removeIf(list -> list.equals(removeElement));

        System.out.println("ArrayList after removing \"" + removeElement + "\":");
        System.out.println(lists);

        System.out.println("_----------");
        arrayRemoveElement(lists);
    }

    public static void arrayRemoveElement(List<String> words) {
        words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("orange");
        words.add("apple");
        words.add("grapes");

        System.out.println("Original ArrayList:");
        System.out.println(words);

        // Element to be removed
        String elementToRemove = "apple";

        java.util.Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.equals(elementToRemove)) {
                iterator.remove();
            }
        }

        System.out.println("ArrayList after removing \"" + elementToRemove + "\":");
        System.out.println(words);
    }
}
