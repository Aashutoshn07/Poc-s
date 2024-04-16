import java.io.File;

public class CreateDirectoryDemo {
    public static void main(String[] args) {
        File file = new File("c:\\nareshit");
        if(file.mkdir()){
            System.out.println("Directory = "+file.getAbsolutePath()+" .");
        }else{
            System.out.println("No Directory was created.");
        }
    }
}
