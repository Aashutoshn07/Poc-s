import java.io.File;

public class GetFileList {
    public static int getFilesInDirectory(File directory) {
        int count = 0; // Initialize count to zero
        File[] files = directory.listFiles();
        if (files != null) { // Check if files is not null
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println("File: " + file.getName()); // Print file name
                    count++;
                }
                if (file.isDirectory()) {
                    count += getFilesInDirectory(file); // Recursive call for subdirectories
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        File directory = new File("Problem_6"); // Specify the directory path here

        if (directory.exists() && directory.isDirectory()) { // Check if directory exists and is a directory
            int i = getFilesInDirectory(directory);
            System.out.println("Total files: " + i);
        } else {
            System.out.println("Invalid directory path.");
        }
    }
}
