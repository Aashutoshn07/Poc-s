import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class StringToStream {
    public static void main(String[] args) {
        String text = "Naresh I Technologies , A Buzz Word in Training and Development Industry";
        try{
            InputStream inputStream = new ByteArrayInputStream(text.getBytes("UTF-8"));
            System.out.println("Converted InputStream content:");
            int byteRead;
            while((byteRead = inputStream.read()) != -1){
                System.out.print((char) byteRead);
            }
            inputStream.close();
        }catch(UnsupportedEncodingException e){
            System.err.println("unsupported endcoding: "+e);
        }catch(IOException e){
            System.err.println("Error reading from InputStream: "+ e);
        }
    }
}
