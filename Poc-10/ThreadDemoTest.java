import java.io.IOException;

public class ThreadDemoTest {
    public static void main(String[] args) {
        Thread first = new Thread(new ThreadDemo("A", "a", 200L));
        Thread second = new Thread(new ThreadDemo("B", "b", 300L));
        Thread third = new Thread(new ThreadDemo("C", "c", 500L));

        System.out.println("Press Enter when you have had enough...\n");
        first.start();
        second.start();
        third.start();

        try {
            System.in.read();
            System.out.println("Enter pressed...\n");
            return;

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
