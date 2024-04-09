import java.util.Optional;
import java.util.stream.Stream;

public class SearchMethodsMain {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5);

        // findFirst
        Optional<Integer> first = stream.findFirst();
        System.out.println("First Element: " + first.orElse(null));

        // Resetting the stream as streams can't be reused after a terminal operation like findFirst
        stream = Stream.of(1, 2, 3, 4, 5);

        // findAny
        Optional<Integer> any = stream.findAny();
        System.out.println("Any Element: " + any.orElse(null));

        // Resetting the stream again
        stream = Stream.of(1, 2, 3, 4, 5,3);

        // anyMatch
        boolean anyMatch = stream.anyMatch(num -> num > 3);
        System.out.println("Any Match > 3: " + anyMatch);

        // Resetting the stream again
        stream = Stream.of(1, 2, 3, 4, 5);

        // allMatch
        boolean allMatch = stream.allMatch(num -> num > 0);
        System.out.println("All Match > 0: " + allMatch);

        // Resetting the stream again
        stream = Stream.of(1, 2, 3, 4, 5);

        // noneMatch
        boolean noneMatch = stream.noneMatch(num -> num > 10);
        System.out.println("None Match > 10: " + noneMatch);
    }
}
