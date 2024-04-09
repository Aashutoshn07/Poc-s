public class CheckForInterface {
    public static void main(String[] args) {
        Class<?> objClass = String.class;

        if (objClass.isInterface()) {
            System.out.println(objClass.getName() + " is an interface.");
        } else {
            System.out.println(objClass.getName() + " is a class.");
        }
        objClass = Runnable.class;
        if (objClass.isInterface()) {
            System.out.println(objClass.getName() + " is an interface.");
        } else {
            System.out.println(objClass.getName() + " is a class.");
        }

    }
}
