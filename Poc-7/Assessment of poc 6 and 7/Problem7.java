public class Problem7 {
    public static void main(String[] args) {
        try {
            System.out.println("Inside Try block.... ");
            // notFinally();
            System.exit(10);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Inside finally block...");
        }
    }

    public static void notFinally() {
        try {
            System.out.println("Inside try block2");
            while (true) {
                // Infinite loop that prevents normal program flow
            }
        } finally {
            System.out.println("Inside finally block");
        }
    }
}
