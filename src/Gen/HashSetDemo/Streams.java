package Gen.HashSetDemo;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by IT_School on 08.11.2015.
 */
public class Streams {
    public static void main(String[] args) {
        Stream.of("a1", "a2", "a3")
                .findFirst()
                .ifPresent(System.out::println);

        IntStream.range(1,4)
                .forEach(System.out::println);
    }
}
