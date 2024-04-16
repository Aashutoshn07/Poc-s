package Problem4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteTextFileDemo {
    public static void main(String[] args) {
        Writer writer = null;

        try {
            File file = new File("write.txt");
            writer = new BufferedWriter(new FileWriter(file));
            String text = "This is a text string to be written to the file.";
            writer.write(text);
            System.out.println("Text successfully written to file: " + file.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error writing to file" + e);
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.err.println("Error closing writer: " + e);

            }
        }
    }
}
