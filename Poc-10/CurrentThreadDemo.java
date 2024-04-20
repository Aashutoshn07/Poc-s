public class CurrentThreadDemo extends Thread {
    @Override
    public void run() {
        for(int i= 0; i< 5; i++){
            printMyName();
        }
    }
    public void printMyName(){
        System.out.println("The Thread name is: "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        CurrentThreadDemo ttsn = new CurrentThreadDemo();
        ttsn.setName("Crated One");
        ttsn.start();

        Thread t2 = currentThread();
        t2.setName("Main One");

        for(int i = 0; i<5;i++){
            ttsn.printMyName();
        }
    }
    
}
