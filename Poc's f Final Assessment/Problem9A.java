import java.util.Arrays;

public class Problem9A {
    public static void main(String[] args) {
        int arr[] = new int[5];

        try {
            arr[0] = 10;
            arr[1] = 20;
            arr[2] = 30;
            arr[3] = 40;
            arr[4] = 50;
            arr[5] = 60;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index of Array! " + e.getMessage());
        } finally {
            System.out.println(Arrays.toString(arr));
        }
    }
}
