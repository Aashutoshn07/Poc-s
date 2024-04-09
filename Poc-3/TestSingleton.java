public class TestSingleton {
    public static void main(String[] args) {
        SingletoneObject s1 = SingletoneObject.getSingletoneObject();
        SingletoneObject s2 = SingletoneObject.getSingletoneObject();

        if (s1 == s2) {
            System.out.println("The Singleton patterin is working. Both objects are the same instance");
        } else {
            System.out.println("The Singleton patterin is not working. Both objects are different instance");
        }
    }
}
