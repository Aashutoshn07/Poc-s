import java.io.File;

public class FileExistDemo {
    public static void main(String[] args) throws Exception {
        // Create an abstract definition of the configuration file to be read
        File file = new File("write.txt");

        // Print the exact location of the file in the file system
        System.out.println("File = " + file.getAbsolutePath());

        // Check if the file exists
        if (!file.exists()) {
            System.out.println("File doesn't exist.");
        } else {
            System.out.println("File exists.");
        }
    }
}
