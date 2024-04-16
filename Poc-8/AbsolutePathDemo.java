import java.io.File;

public class AbsolutePathDemo {
    public static void main(String[] args) {
        try{
            File file = new File("append.txt");
            String absolutePath = file.getAbsolutePath();
            System.out.println(absolutePath);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
