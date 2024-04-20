package Problem_8;

public class PrintTask implements Runnable {
    int sleepTime;
    String threadName;

    public PrintTask(int sleepTime, String threadName) {
        this.sleepTime = sleepTime;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            System.out.printf("%s going to sleep for %d milliseconds.\n", threadName, sleepTime);
            Thread.sleep(sleepTime);
        } catch (InterruptedException e) {
            System.out.println("Thread is Interrupted.");
        }
        System.out.printf("%s done sleeping \n", threadName);
    }

}
