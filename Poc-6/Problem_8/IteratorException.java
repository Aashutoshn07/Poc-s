package Problem_8;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class IteratorException {
    public static void main(String[] args) {
        try{
            List list = new ArrayList<>();
            
            list.add("1");
            list.add("2");
            list.add("3");
            // list.add("34");

            Iterator itr = list.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }   
            System.out.println(itr.next());
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
