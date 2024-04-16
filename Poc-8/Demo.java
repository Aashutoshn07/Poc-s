import java.io.*;

public class Demo {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            File file = new File("write1.txt");
            writer = new BufferedWriter(new FileWriter(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}