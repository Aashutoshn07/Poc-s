import java.io.IOException;

public class Demo {
    public static void main(String[] args) {
        try {
            // Simulating IOException by trying to read from a non-existent file
            readFile("nonexistentfile.txt");

            // Simulating ClassNotFoundException by trying to load a non-existent class
            loadClass("NonExistentClass");
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException occurred: " + e.getMessage());
        }
    }

    public static void readFile(String fileName) throws IOException {
        // Simulate reading from a file
        throw new IOException("File not found: " + fileName);
    }

    public static void loadClass(String className) throws ClassNotFoundException {
        // Simulate loading a class
        throw new ClassNotFoundException("Class not found: " + className);
    }
}
