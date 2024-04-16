import java.io.*;

public class StreamToStringDemo {
    public String convertStreamToString(InputStream is) throws IOException {
        if (is == null) {
            throw new IllegalArgumentException("Input stream is null.");
        }

        StringBuilder sb = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(is))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        StreamToStringDemo demo = new StreamToStringDemo();
        InputStream inputStream = StreamToStringDemo.class.getResourceAsStream("example.txt");

        try {
            if (inputStream != null) {
                String result = demo.convertStreamToString(inputStream);
                System.out.println("Converted string:");
                System.out.println(result);
            } else {
                System.err.println("Input stream is null.");
            }
        } catch (IOException e) {
            System.err.println("Error converting stream to string: " + e.getMessage());
        }
    }
}
