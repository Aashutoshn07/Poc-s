
import java.io.FileWriter;
import java.io.IOException;

public class ConcatenateFilesSimple {
    public static void main(String[] args) {
        // Specify the file path for the output file
        String outputFilePath = "index.txt";

        try {
            // Create FileWriter object to write to the output file
            FileWriter writer = new FileWriter(outputFilePath, true);

            // Concatenate text from multiple sources
            String text1 = "This is text from source 4.\n";
            String text2 = "This is text from source 5.\n";
            String text3 = "This is text from source 6.\n";

            // Write concatenated text to the output file
            writer.write(text1);
            writer.write(text2);
            writer.write(text3);

            // Close the FileWriter object
            writer.close();

            System.out.println("Text concatenated and written to the file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
