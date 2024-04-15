import java.io.IOException;

public class Problem4 {
    public static void main(String[] args) {
        try{
            readFile("demo.txt");

        }catch(IOException e){
            System.out.println("IOException cought in main method: "+e);
        }
    }
    public static void readFile(String str)throws IOException{
        throw new IOException("File Not found: "+str);
    }
}
