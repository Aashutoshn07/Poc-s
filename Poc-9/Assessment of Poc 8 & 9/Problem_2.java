import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Problem_2 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Please Provide necessary inputs.");
            return;
        }

        String filePath = args[0];
        String appendedString = args[1];

        File file = new File(filePath);
        file.canWrite();
        file.canRead();

        try {
            FileOutputStream outputStream = new FileOutputStream(file, true);
            outputStream.write(appendedString.getBytes());
            System.out.println("Data appended successfully.");
            outputStream.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {

        }
    }
}
