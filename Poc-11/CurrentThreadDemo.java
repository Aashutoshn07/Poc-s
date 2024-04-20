public class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println("Current Thread: " + t1);

        t1.setName("T1NEW");
        System.out.println("After Name change: " + t1);

        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}