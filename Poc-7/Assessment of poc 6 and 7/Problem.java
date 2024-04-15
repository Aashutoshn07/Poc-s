import java.io.FileReader;
import java.io.IOException;

public class Problem {
    public static void main(String[] args) {

        loadClass("Demo1");
        readFile("dem.txt");

    }

    public static void readFile(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void loadClass(String className) {
        try {
            Class<?> dynamicClass = Class.forName(className);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}