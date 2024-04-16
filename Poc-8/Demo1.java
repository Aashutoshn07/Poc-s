import java.io.*;

public class Demo1 {
    public static void main(String[] args) {
        try{
            File file = new File("append.txt");
            FileReader reader = new FileReader("append.txt");
            // System.out.println((char)reader.read());
            // System.out.println((char)reader.read());
            // System.out.println((char)reader.read());
            // System.out.println((char)reader.read());
            for(int i=0;i<file.length();i++){
                System.out.print((char)reader.read());
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
