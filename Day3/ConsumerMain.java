import java.util.function.Consumer;

public class ConsumerMain {
    public static void main(String[] args) {
        Consumer<String> consumer = (t) -> System.out.println(t);
        consumer.accept("Ramesh");

        Consumer<String> consumer2 = (input) -> System.out.println(input);

        consumer2.accept("Walter");

        consumer2.andThen(consumer).accept("hello");
    }
}
