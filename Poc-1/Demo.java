public class Demo{
    public static void main(String[] args) {
        String arr = "String";
        for(int i=arr.length()-1; i>=0;i--){
            System.out.print(arr.charAt(i));
        }
        System.out.println();
       System.out.println( arr.toUpperCase());
    }
}