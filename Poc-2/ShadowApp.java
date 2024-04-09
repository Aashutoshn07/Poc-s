public class ShadowApp {
    private static int x;
    public static void main(String[] args) {
        x=5;
        System.out.println("The value of static variable x is: "+x);
        int x ;
        x= 10;
        System.out.println("The value of lacal variable x is: "+x);

        System.out.println("The value of class variable x is: "+ShadowApp.x);
        
    }
}
