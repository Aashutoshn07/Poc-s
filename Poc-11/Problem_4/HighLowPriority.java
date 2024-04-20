package Problem_4;

public class HighLowPriority {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        // Thread.currentThread(Thread.MAX_PRIORITY);
        Clicker hi = new Clicker(Thread.NORM_PRIORITY + 2);
        Clicker lo = new Clicker(Thread.NORM_PRIORITY - 2);

        hi.start();
        lo.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted.");
        }

        hi.stop();
        lo.stop();

        try {
            hi.t.join();
            lo.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception cought: ");
        }
        System.out.println("Low-priority Thread: " + lo.click);
        System.out.println("High-priority Thread: " + hi.click);
    }
}
