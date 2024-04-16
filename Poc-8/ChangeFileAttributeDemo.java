import java.io.File;

public class ChangeFileAttributeDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("AttributeCheck.txt");

        file.createNewFile();

        file.setReadOnly();

        if (file.canWrite()) {
            System.out.println("File is modifiable.");
        } else {
            System.out.println("File is in read-only mode.");
        }

        file.setWritable(true);

        if (file.canWrite()) {
            System.out.println("File is modifiable.");
        } else {
            System.out.println("File is in read-only mode.");
        }
    }
}
