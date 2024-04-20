package Problem_4;

public class TestCase {
    public static void main(String[] args) throws Exception {
        MyThread mt = new MyThread("A");
        Thread.sleep(100);
        mt.suspend();

        Thread.sleep(100);
        mt.resume();

        Thread.sleep(100);
        mt.resume();

        Thread.sleep(100);
        mt.resume();

        Thread.sleep(100);
        mt.stop();

    }
}
