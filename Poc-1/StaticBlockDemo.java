import java.util.Random;

public class StaticBlockDemo {
    static int[] values = new int[10];
    
    static{
        Random random = new Random();
        System.out.println("We are inside the static block!!");

        for(int i = 0 ; i<values.length;i ++){
            values[i] = random.nextInt(100);
        }
    }

    public void listValues() {
        for(int i: values){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        System.out.println("We are in the Main Method");
        StaticBlockDemo s1 = new StaticBlockDemo();
        StaticBlockDemo s2 = new StaticBlockDemo(); 

        s1.listValues();
        s2.listValues();
    }
    
}
