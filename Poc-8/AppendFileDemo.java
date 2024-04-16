import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendFileDemo {
    public static void main(String[] args) {
        try{
            File file = new File("append.txt");
            FileWriter writer = new FileWriter(file,true);
            writer.write("converted String..... from AppendFileDemo..."+System.getProperty("line.seperator"));
            writer.flush();
            writer.close();
            System.out.println("Data successfully append to file: "+file.getAbsolutePath());
        }catch(IOException e){
            System.err.println("Error appending data to file: "+e.getMessage());
        }
    }
}
