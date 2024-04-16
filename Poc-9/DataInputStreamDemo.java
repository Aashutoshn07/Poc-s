import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("index3.txt");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);

            while (true) {
                try {

                    System.out.println(dataInputStream.readInt());
                    System.out.println(dataInputStream.readUTF());
                    System.out.println(dataInputStream.readInt());
                    System.out.println(dataInputStream.readUTF());
                    System.out.println(dataInputStream.readFloat());
                } catch (EOFException e) {
                    // System.out.println(e);
                    break;
                }
            }

            dataInputStream.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
