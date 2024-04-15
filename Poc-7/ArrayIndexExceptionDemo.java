import java.util.Arrays;

public class ArrayIndexExceptionDemo {
    public static void main(String[] args) {
        int a[] = new int[2];
        try{
            System.out.println(a[1]);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundException: Out of limit. "+e.getMessage());
        }finally{
            System.out.println(Arrays.toString(a));
        }
    }
}
