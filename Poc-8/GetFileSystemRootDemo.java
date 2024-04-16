import java.io.File;

public class GetFileSystemRootDemo {
    public static void main(String[] args) {
        File[] root = File.listRoots();
        for(int i=0;i<root.length;i++){
            File file = root[i];
            System.out.println("ROOT: "+ file.getAbsolutePath());
        }
    }
}
