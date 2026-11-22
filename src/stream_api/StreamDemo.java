package stream_api;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        /*Streams in java*/
        //It is sequence of elements which supports functional and declarative programming.
        //Feature introduced in java8
        //Process collections of data in a functional and declarative manner
        //Simply data processing
        //Embraces the functional programming.

        /* How to use Streams */
        //Sources , intermediate operations and terminal operations
        //Here numbers is source, then we converted it to stream,
        // filter is intermediate operation and count is terminal operation.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> evenNumbers = numbers.stream().filter((x) -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(evenNumbers);

        //Creating Streams
        //1. From collection
        List<Integer> num = Arrays.asList(1, 23, 4, 5);
        Stream<Integer> numStream = num.stream();

        //2. From Arrays
        String[] arrays = {"a", "b", "c"};
        Stream<String> str = Arrays.stream(arrays);

        //3. Using Stream.of()
        Stream<String> names = Stream.of("ankit", "Vikram", "Shital");

        //4. Infinite Stream
        List<Integer> limit = Stream.generate(() -> 1).limit(100).collect(Collectors.toList());
        System.out.println(limit);

        List<Integer> limit2 = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println(limit2);

    }
}
