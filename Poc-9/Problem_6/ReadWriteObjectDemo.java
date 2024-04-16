package Problem_6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadWriteObjectDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("book.dat");
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

            Book book = new Book("01/04/2024", "Glimpse of Java", "Aashutosh Naik");
            System.out.println(book.toString());
            outputStream.writeObject(book);
            System.out.println("Done");
            outputStream.close();

            FileInputStream fileInputStream = new FileInputStream("book.dat");
            ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
            Object obj1 = inputStream.readObject();
            System.out.println(obj1.toString());
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
