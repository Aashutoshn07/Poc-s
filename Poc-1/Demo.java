public class Demo {
    public static void main(String[] args) throws InterruptedException {
        String arr = "String";
        for (int i = arr.length() - 1; i >= 0; i--) {
            System.out.print(arr.charAt(i));
        }
        System.out.println();
        System.out.println(arr.toUpperCase());

        Object obj = new Object();

        System.out.println(obj.getClass());
        System.out.println(obj.hashCode());
        System.out.println(obj.toString());
        obj.wait(10000);
        obj.notify();
        // System.out.println(obj.notify(););
    }
}