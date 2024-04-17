package Problem_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem_3 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Please provide input");
            return;
        }

        String inputFilePath = args[0];
        String outputFilePath = args[1];

        List<String> names = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Capitalize the first letter of each name
                String capitalized = line.substring(0, 1).toUpperCase() + line.substring(1);
                names.add(capitalized);
            }
        } catch (IOException e) {
            System.err.println("Error reading input file: " + e.getMessage());
            return;
        }

        // Sort the names alphabetically
        Collections.sort(names);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            for (String name : names) {
                writer.write(name);
                writer.newLine();
            }
            System.out.println("Processed names have been written to the output file.");
        } catch (IOException e) {
            System.err.println("Error writing to output file: " + e.getMessage());
        }
    }
}
