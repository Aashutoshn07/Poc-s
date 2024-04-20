public class CounterThread extends Thread {
    String name;

    public CounterThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int count = 0;
        int i = 0;
        while (i <= 100) {
            i++;
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            if (count == 50)
                count = 0;

            System.out.println("The name is: " + name + " count is: " + count);
        }
    }
}
