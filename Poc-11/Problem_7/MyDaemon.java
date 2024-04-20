package Problem_7;

public class MyDaemon implements Runnable {
    Thread thrd;

    public MyDaemon() {
        thrd = new Thread(this);
        thrd.setDaemon(true);
        thrd.start();
    }

    public boolean isDaemon() {
        return thrd.isDaemon();
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println(".");
                Thread.sleep(100);
            }
        } catch (Exception exc) {
            System.out.println("My Daemon interrupted.");
        }
    }
}
