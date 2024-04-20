package Problem_8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestClass {
    public static void main(String[] args) {
        PrintTask task1 = new PrintTask(1000, "thread1");
        PrintTask task2 = new PrintTask(1000, "thread2");
        PrintTask task3 = new PrintTask(1000, "thread3");

        System.out.println("Starting Threads!");
        ExecutorService threadExecutor = Executors.newCachedThreadPool();

        threadExecutor.execute(task1);
        threadExecutor.execute(task2);
        threadExecutor.execute(task3);

        threadExecutor.shutdown();
        System.out.println("Threads started, main ends.");
    }
}
