import java.util.ArrayList;

public class Problem_4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(32);
        arrayList.add(56);
        arrayList.add(20);
        arrayList.add(89);
        arrayList.add(76);

        arrayList.set(2, 77);
        int index = 1;
        int value = 65;
        System.out.println(arrayList);
        if (index >= 0 && index < arrayList.size()) {
            arrayList.set(index, value);
            System.out.println("Array List after replacement: ");
            System.out.println(arrayList);
        } else {
            System.out.println("Invalid index~");
        }
    }
}
