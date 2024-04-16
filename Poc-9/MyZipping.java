import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.zip.Adler32;
import java.util.zip.CheckedOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class MyZipping {
    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            System.out.println("Usage: java MyZipping <file1> <file2> ... <fileN>");
            return;
        }
        FileOutputStream f = new FileOutputStream("E:/Demo.zip");
        CheckedOutputStream csum = new CheckedOutputStream(f, new Adler32());
        ZipOutputStream zos = new ZipOutputStream(csum);
        BufferedOutputStream out = new BufferedOutputStream(zos);

        zos.setComment("This is comment...");

        for (int i = 0; i < args.length; i++) {
            System.out.println("Writing file...: " + args[i]);
            BufferedReader in = new BufferedReader(new FileReader(args[i]));
            zos.putNextEntry(new ZipEntry(args[i]));

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            in.close();
        }
        out.close();
        zos.close();
        System.out.println("File successfully zipped to E://Nareshit.zip");
    }
}
