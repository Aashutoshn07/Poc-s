// import java.util.Arrays;
// import java.util.List;
// import java.util.function.Predicate;
// import java.util.stream.Collector;
// import java.util.stream.Collectors;

import java.util.Arrays;

public class Demo {

    public static void main(String[] args) {
        // Predicate <Integer> predicate = new Demo()
        // Predicate<String> predicate = (String t) -> {
        // return t.startsWith(t));
        // };
        // System.out.println(predicate.test("abhi"));

        // List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // Predicate<Integer> predicate2 = ( x) -> x > 5;
        // Predicate<Integer> predicate3 = ( x) -> x < 8;
        // list.stream().filter(predicate2.and(predicate3)).collect(Collectors.toList()).forEach(System.out::print);

        int[] arr = { 28, 45, 10, 64, 5, 13 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[4]);
    }
}
