package Problem_9;

public class TestSynchronized {
    private int taskId;

    public synchronized void performATask(int val) {
        taskId = val;
        print("before: " + taskId);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println("Thread is Interrupted." + e);
        }
        print("after: " + taskId);
    }

    public static void print(String msg) {
        System.out.println(Thread.currentThread().getName() + ": " + msg);
    }

    public static void main(String[] args) throws Exception {
        final TestSynchronized tus = new TestSynchronized();
        Runnable runA = new Runnable() {
            public void run() {
                tus.doAction(1);
            }
        };
        Thread ta = new Thread(runA, "threadA");
        ta.start();

        Thread.sleep(2000);

        Runnable runB = new Runnable() {
            public void run() {
                tus.performATask(2);
            }
        };
        Thread tb = new Thread(runB, "threadB");
    }

    public void doAction(int val) {
        print("entering doAction()");
        taskId = val;
        print("doAction() taskID" + taskId);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        print("doAction() sleep after taskId" + taskId);
        print("Leaving doAction()");

    }
}
