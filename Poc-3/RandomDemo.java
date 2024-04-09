import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        double var;
        Random random = new Random(100);
        var = random.nextDouble();

        System.out.println(var);
    }
}
