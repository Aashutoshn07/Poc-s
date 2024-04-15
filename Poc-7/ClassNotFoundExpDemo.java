public class ClassNotFoundExpDemo {
    public ClassNotFoundExpDemo() {
        Class c;
        try {
            c = Class.forName("TestClass");

        } catch (ClassNotFoundException e)
        {
            System.out.println("Class Not found.");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        ClassNotFoundExpDemo classNotFoundExpDemo = new ClassNotFoundExpDemo();

    }
}
