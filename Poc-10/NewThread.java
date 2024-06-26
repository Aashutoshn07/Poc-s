public class NewThread extends Thread {

    Thread t;
    NewThread(){
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread: "+ t);
        t.start();
    }

    @Override
    public void run() {
        try{
            for(int i = 5;i>0; i--){
                System.out.println("Child Thread: " +i);
                Thread.sleep(500);
            }
        }catch(InterruptedException e){
            System.out.println("Child Interrupted.");
        }
        System.out.println("Exiting child thread.");
    }
    
}
