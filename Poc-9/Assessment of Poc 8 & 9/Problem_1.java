import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Problem_1 {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.err.println("Please Provide necessary inputs.");
            return;
        }
        String filePath = args[0];
        boolean enableRead = Boolean.parseBoolean(args[1]);
        boolean enableWrite = Boolean.parseBoolean(args[2]);

        File file = new File("index.txt");
        if (!file.exists()) {
            System.err.println("File not found.");
            return;
        }
        if (enableRead) {
            file.setReadable(true);
        } else {
            file.setReadable(false);
        }

        if (enableWrite) {
            file.setWritable(true);
        } else {
            file.setWritable(false);
        }
        System.out.println("File Permissions modified!");

        try {
            FileWriter writer = new FileWriter("index.txt", true);
            // BufferedOutputStream outputStream = new BufferedOutputStream(writer);
            String str = "This is string from problem 1.";
            writer.write(str);
            writer.flush();
            writer.close();

            FileReader reader = new FileReader("index.txt");
            System.out.println(reader.read());
            reader.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}