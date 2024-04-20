package Problem_6;

public class NewThread extends Thread {
    boolean suspendFlag;

    public NewThread(String threadName, ThreadGroup tgOb) {
        super(tgOb, threadName);
        suspendFlag = false;
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Exception in " + getName());
        }
    }

    public void mySuspend() {
        suspendFlag = true;
    }

    public synchronized void myResume() {
        suspendFlag = false;
        notify();
    }
}
