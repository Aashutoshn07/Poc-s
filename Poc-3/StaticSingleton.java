public class StaticSingleton {
    // Private static variables
    private static final String name = "Singleton";
    private static int counter = 0;

    // Private constructor to prevent instantiation
    private StaticSingleton() {
    }

    // Public static method to access the singleton instance
    public static String getInstance() {
        counter++;
        return name + " Instance " + counter;
    }

    // Other static methods and variables can be added here
}
