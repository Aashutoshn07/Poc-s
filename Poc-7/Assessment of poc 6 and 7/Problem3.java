import java.util.IllegalFormatException;

public class Problem3 {
    public static void main(String[] args) {
        int arr[]= {43,23,76,98};
        try{

            System.out.println(arr[4]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The program is dealing with false length. "+e);
        }
        illegalFromate();
    }
    public static void illegalFromate(){
        try{
            String str = String.format("The number is: %.2f", 20);
            System.out.println(str);
        }catch(IllegalFormatException e){
            System.out.println("The formate is illegal! "+e);
            // throw new IllegalFormatException("Custom IllegalFormatException inside catch block");
        }
    }
}
