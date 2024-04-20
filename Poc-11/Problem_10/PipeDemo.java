package Problem_10;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;

public class PipeDemo {
    public static void main(String[] args) throws IOException {
        PipedWriter pw = new PipedWriter();
        PipedReader pr = new PipedReader(pw);
        try {
            Thread readerThread = new Thread(() -> {
                try {
                    int ch;
                    while ((ch = pr.read()) != -1) {
                        System.out.println((char) ch);
                    }
                } catch (IOException e) {
                    System.out.println("Error reading  from PipeReader: " + e);
                }
            });
            readerThread.start();
            for (int i = 1; i <= 15; i++) {
                pw.write("A" + i + '\n');
            }
            pw.close();
            readerThread.join();
        } catch (IOException | InterruptedException e) {
            System.out.println("Error: " + e);
        }
    }
}
