public class TestInterruptedException {
    public static void main(String[] args) {
        final Thread mainThread = Thread.currentThread();

        Thread interruptingThread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                mainThread.interrupt();
            }
        });

        interruptingThread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("I was interrupted.");
        }
    }
}
