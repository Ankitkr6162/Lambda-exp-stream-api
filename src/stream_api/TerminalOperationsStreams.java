package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TerminalOperationsStreams {

    public static void main(String[] args) {

        //1. collect - the collect method is a terminal operation used to transform the elements
        //of stream to a different form or a single aggregated value after perform the operation.
        List<Integer> streamedList = Arrays.asList(1, 2, 3, 4, 5).stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(streamedList);

        //2. forEach - The forEach method in Java Streams is used to perform an action on each element of the stream.
        // It is a terminal operation,
        // meaning it processes all elements of the stream and does not return another stream.
        List<String> names = Arrays.asList("Ankit", "Santosh", "Rakhi");
        names.stream().forEach(x -> System.out.println(x));

        //3 reduce -  It is used to perform a reduction operation on the elements of a stream,
        // combining them into a single result.
        List<Integer> numbers = Arrays.asList(13, 123, 4, 112, 87);
        List<Integer> reducedNumbers = numbers.stream().reduce((x, y) -> (x + y)).stream().collect(Collectors.toList());
        System.out.println(reducedNumbers);

        //4. anyMatch, allMatch, noneMatch
        List<Integer> list = Arrays.asList(12, 13, 14, 15);
        boolean anyEvenMatch = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(anyEvenMatch);

        boolean allEvenMatch = list.stream().allMatch(x -> x % 2 == 0);
        System.out.println(allEvenMatch);

        boolean noneZero = list.stream().noneMatch(x -> x < 0);
        System.out.println(noneZero);

        //5 findFirst, findAny
        Optional<Integer> firstNumbers = list.stream().findFirst().get().describeConstable();
        System.out.println(firstNumbers);


        Optional<Integer> findAnyNumbers = list.stream().findAny().get().describeConstable();
        System.out.println(findAnyNumbers);


        // Examples

        //Names more the 3 letters
        List<String> namelist = Arrays.asList("Ana", "Bob", "Mary", "Dilip", "Rashmi");
        List<String> streamedNames = namelist.stream().filter(x -> x.length() > 3).collect(Collectors.toList());
        System.out.println(streamedNames);

        //Squaring and sorting numbers
        List<Integer> list1 = Arrays.asList(90, 23, 84, 45, 64);
        List<Integer> collect = list1.stream().map(x -> x * x).sorted().collect(Collectors.toList());
        System.out.println(collect);

        //Summing the values
        List<Integer> list2 = Arrays.asList(12, 23, 445, 12);
        List<Integer> summedNumbers = list2.stream().reduce((x, y) -> (x + y)).stream().collect(Collectors.toList());
        System.out.println(summedNumbers);

        //Occurrence of letter 'l'
        String sentence = "hello world";
        IntStream chars = sentence.chars();
        long count = chars.asLongStream().filter(x -> x == 'l').count();
        System.out.println(count);
    }
}
