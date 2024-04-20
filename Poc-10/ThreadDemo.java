public class ThreadDemo implements Runnable{
    private String firstName;
    private String secondName;
    private long aWhile;

    public ThreadDemo(String firstName, String secondName, long aWhile) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.aWhile = aWhile;
    }
    @Override
    public void run() {
        try{
            while(true){
                System.out.println(firstName);
                Thread.sleep(aWhile);
                System.out.println(secondName + "\n");
            }
        }catch(InterruptedException e){
            System.out.println(firstName + secondName + e);
        }
    }
}