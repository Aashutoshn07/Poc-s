import java.io.File;
import java.util.Date;

public class LastModificationDateDemo {
    public static void main(String[] args) {
        File file = new File("example2.txt");
        Date date = new Date(file.lastModified());

        System.out.println(file.lastModified());
        System.out.println(date);
    }
}   
