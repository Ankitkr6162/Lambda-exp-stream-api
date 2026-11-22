package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperationsStreams {

    //Intermediate operations transforms a stream into another stream.
    //They are lazy, meaning they don't execute until a terminal operations is invoked

    public static void main(String[] args) {

        // 1. filter - The filter method in Java's Stream API is used to filter elements of a stream based
        // on a given condition (predicate)
        List<String> nameList = Arrays.asList("Ankit", "Akash", "Radha", "Madhu", "Jeevan", "Amit");
        Stream<String> collect = nameList.stream().filter(x -> x.startsWith("A"));
        List<String> collect1 = collect.collect(Collectors.toList());
        System.out.println(collect1);

        // 2. map - The map() method in Java Streams is used when you need to transform each
        // element of a stream into another form
        List<String> fruits = Arrays.asList("mango", "PineApple", "mantra", "grapes");
        List<String> streamFruits = fruits.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        System.out.println(streamFruits);

        // 3. sorted - This method returns a new stream with sorted elements
        List<Integer> numbers = Arrays.asList(112, 34, 98, 234, 789);
        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumbers);

        //4 distinct - This method returns the distinct stream of elements with no duplicates.
        List<String> names = Arrays.asList("Ankit", "Ankit", "Vikas","Mukesh","Vikas","Mukesh");
        List<String> distinctNames = names.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctNames);

        //5 limit -The limit() method in Java 8 Streams is used to truncate a stream to contain only the first n elements.
        // It is particularly useful when working with large or infinite streams
        List<Integer> limitNumbers = Stream.iterate(1, x -> x + 1).limit(30).collect(Collectors.toList());
        System.out.println(limitNumbers);

        //6. skip - The skip(n) method discards the first n elements of a stream and returns the remaining elements.
        List<Integer> limitSkippedNumbers = Stream.iterate(1, x -> x + 1).skip(10).limit(30).collect(Collectors.toList());
        System.out.println(limitSkippedNumbers);



    }
}
