public class MainSingletone {
    public static void main(String[] args) {  
        SingletoneObject singleton1 = SingletoneObject.getSingletoneObject();  
        SingletoneObject singleton2 = SingletoneObject.getSingletoneObject();  
        if (singleton1 == singleton2) {  
            System.out.println("Both objects are the same instance.");  
        }  
    }  
}
