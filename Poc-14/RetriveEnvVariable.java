import java.util.Iterator;
import java.util.Map;

public class RetriveEnvVariable {
    public static void main(String[] args) {
        System.out.println("PATH = " + System.getenv("PATH"));
        Map<String, String> env = System.getenv();

        Iterator<Map.Entry<String, String>> iterator = env.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
