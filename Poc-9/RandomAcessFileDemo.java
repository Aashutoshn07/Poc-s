import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAcessFileDemo {
    public static void main(String[] args) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("book.dat", "rw");
            String books[] = { "Java", "RDBMS", "NETWORKING" };
            for (String book : books) {
                randomAccessFile.writeUTF(book);
            }
            randomAccessFile.writeUTF("Author Name");
            randomAccessFile.seek(0);
            while (randomAccessFile.getFilePointer() < randomAccessFile.length()) {
                System.out.println(randomAccessFile.readUTF());
            }
            randomAccessFile.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            // System.out.println(e);
        }
    }
}
