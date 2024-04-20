package Problem_7;

public class TestDaemon {
    public static void main(String[] args) throws Exception {
        MyDaemon dt = new MyDaemon();
        if (dt.isDaemon())  
            System.out.println("dt is a Daemon thread.");

        Thread.sleep(2000);
        System.out.println("Main Thread is ending......");
    }
}
