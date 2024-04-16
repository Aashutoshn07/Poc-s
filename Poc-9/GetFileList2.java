import java.io.IOException;
import java.util.Enumeration;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

public class GetFileList2 {
    public static void main(String[] args) throws IOException {
        JarFile jarFile = new JarFile("index.txt");
        Enumeration<JarEntry> entries = jarFile.entries();

        while (entries.hasMoreElements()) {
            JarEntry jarEntry = entries.nextElement();
            String name = jarEntry.getName();
            System.out.println(name);
        }
        jarFile.close();
    }
}
