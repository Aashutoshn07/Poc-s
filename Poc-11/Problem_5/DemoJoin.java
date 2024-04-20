package Problem_5;

public class DemoJoin {
    public static void main(String[] args) {
        NewThread ob1 = new NewThread("one");
        NewThread ob2 = new NewThread("two");
        NewThread ob3 = new NewThread("three");

        System.out.println("Thread one is alive: " + ob1.t.isAlive());
        System.out.println("Thread two is alive: " + ob2.t.isAlive());
        System.out.println("Thread three is alive: " + ob3.t.isAlive());

        try {
            System.out.println("Wating for thread to finish.");
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception occured in Main: " + e);
        }

        System.out.println("Thread one is alive: " + ob1.t.isAlive());
        System.out.println("Thread two is alive: " + ob2.t.isAlive());
        System.out.println("Thread three is alive: " + ob3.t.isAlive());
        System.out.println("Main thrad exiting.");
    }
}
