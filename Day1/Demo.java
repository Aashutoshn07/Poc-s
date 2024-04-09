import java.util.ArrayList;
import java.util.List;

public class Demo {
    static public void useExceptions() {
        try{int a = 23 / 0;}
        catch(Exception e){
            // e.printStackTrace();
            System.out.println("You should be very active while using this type of values!!");
        }

    }
    public static void secondUseExceptions(){
        List list = new ArrayList();
        
        list.add(10);
        list.add("10");
        list.add("list");

        System.out.println(list);
        System.out.println(list.remove(2));
        System.out.println(list);
    }
    public static void useGeneric(){
        List <Integer> list= new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(8);
        System.out.println(list);
    }

    public static void main(String args[]) {
        secondUseExceptions();
        useGeneric();
    }
}

// int a=50/0;//ArithmeticException

// String s=null;
// System.out.println(s.length());//NullPointerException

// String s="abc";
// int i=Integer.parseInt(s);//NumberFormatException

// int a[]=new int[5];
// a[10]=50; //ArrayIndexOutOfBoundsException