public class TestClass {
    public TestClass() {

        Runnable runner = new MyRunnable("First");
        Thread t = new Thread(runner);
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();

        runner = new MyRunnable("Second");
        t = new Thread(runner);
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
    }
}
