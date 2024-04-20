public class MyRunnable implements Runnable {

    String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 1000) {
            System.out.println("The Name is: " + name);
            // i++;
        }
    }
}
