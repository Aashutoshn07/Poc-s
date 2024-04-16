public class CurrentDirectoryDemo {
    public static void main(String[] args) {
        String USER_DIR_KEY = "user.dir";
        String currentDir = System.getProperty(USER_DIR_KEY);

        // Print the value of currentDir to the console after concatenating it with a
        // message
        System.out.println("Current working directory: " + currentDir);
    }
}
